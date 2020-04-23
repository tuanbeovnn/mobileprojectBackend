package com.dangvandat.repository.impl;

import com.dangvandat.dto.AbstractDTO;
import com.dangvandat.entity.CalendarEntity;
import com.dangvandat.paging.Pageble;
import com.dangvandat.repository.ICalendarRepository;
import com.dangvandat.search.SearchTeacher;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalendarRepository extends AbstractJDBC<CalendarEntity> implements ICalendarRepository {
    @Override
    public List<CalendarEntity> findAll(SearchTeacher searchTeacher, Pageble pageble) {
        Map<String , Object> properties = builMapSearch(searchTeacher);
        return findAll(properties , pageble);
    }

    private Map<String, Object> builMapSearch(SearchTeacher searchTeacher) {
        Map<String , Object> result = new HashMap<>();
        try{
            Field[] fields = SearchTeacher.class.getDeclaredFields();
            for(Field field : fields){
                field.setAccessible(true);
                if (field.get(searchTeacher) != null){
                    if(StringUtils.isNotBlank((String) field.get(searchTeacher))){
                        result.put(field.getName().toLowerCase() , field.get(searchTeacher));
                    }
                }
            }
        }catch (IllegalArgumentException | IllegalAccessException e){
            e.printStackTrace();
        }
        return result;
    }
}
