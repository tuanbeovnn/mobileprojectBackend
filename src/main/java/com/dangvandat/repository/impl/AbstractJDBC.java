package com.dangvandat.repository.impl;

import com.dangvandat.annotation.Table;
import com.dangvandat.mapper.ResultSetMapper;
import com.dangvandat.paging.Pageble;
import com.dangvandat.paging.Sorter;
import com.dangvandat.repository.GenericJDBC;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

public class AbstractJDBC<T> implements GenericJDBC<T> {

    private Class<T> zClass;
    ResourceBundle resourceBundle = ResourceBundle.getBundle("db");
    @SuppressWarnings("unchecked")
    public AbstractJDBC() {
        Type type = getClass().getGenericSuperclass();
        ParameterizedType parameterType = (ParameterizedType) type;
        zClass = (Class<T>) parameterType.getActualTypeArguments()[0];
    }

    private Connection getConnection() {
        try {
            String classForname = "com.mysql.cj.jdbc.Driver";
            Class.forName(classForname);
            String URL = resourceBundle.getString("url");
            String username = resourceBundle.getString("user");
            String password = resourceBundle.getString("password");
            return DriverManager.getConnection(URL , username , password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<T> findAll(Map<String , Object> properties , Pageble pageble, Object... where) {
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ResultSetMapper<T> resultSetMapper = new ResultSetMapper<>();

        StringBuilder sql = createSqlFindAll(properties);
        if(where != null && where.length > 0){
            sql.append(where[0]);
        }
        if(pageble != null){
            if(pageble.getSorter() != null
                    && StringUtils.isNotBlank(pageble.getSorter().getSortName())
                    && StringUtils.isNotBlank(pageble.getSorter().getSortBy())){
                Sorter sorter = pageble.getSorter();
                sql.append(" ORDER BY "+sorter.getSortName()+" "+sorter.getSortBy()+"");
            }
            if(pageble.getOffSet() != null && pageble.getLimit() != null){
                sql.append(" LIMIT "+pageble.getOffSet()+", "+pageble.getLimit()+"");
            }
        }
        try {
            conn = getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql.toString());
            if(conn != null && resultSet != null) {
                return resultSetMapper.mapRow(resultSet, this.zClass);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if(conn != null) {
                    conn.close();
                }
                if(statement != null) {
                    statement.close();
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return new ArrayList<>();
    }

    private StringBuilder createSqlFindAll(Map<String, Object> properties) {
        String tableName = "";
        if(zClass.isAnnotationPresent(Table.class)){
            Table table = zClass.getAnnotation(Table.class);
            tableName = table.name();
        }
        StringBuilder result = new StringBuilder("SELECT * FROM "+tableName+" A WHERE 1=1");
        if(properties != null && properties.size() > 0){
            String[] params = new String[properties.size()];
            Object[] value = new Object[properties.size()];
            int i = 0;
            for(Map.Entry<? , ?> item : properties.entrySet()){
                params[i] = (String) item.getKey();
                value[i] = item.getValue();
                i++;
            }
            for(int i1 = 0 ; i1 < params.length ; i1++){
                if(value[i1] != null){
                    if(value[i1] instanceof String){
                        result.append(" AND LOWER("+params[i1]+") LIKE '%"+value[i1].toString().toLowerCase()+"%'");
                    }else if(value[i1] instanceof Integer){
                        result.append(" AND "+params[i1]+" = "+value[i1]+" ");
                    }else if(value[i1] instanceof Long){
                        result.append(" AND "+params[i1]+" = "+value[i1]+" ");
                    }
                }
            }
        }
        return result;
    }
}
