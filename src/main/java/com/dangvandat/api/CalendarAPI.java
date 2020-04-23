package com.dangvandat.api;

import com.dangvandat.dto.CalendarDTO;
import com.dangvandat.paging.Pageble;
import com.dangvandat.paging.impl.PageRequest;
import com.dangvandat.search.SearchTeacher;
import com.dangvandat.service.ICalendarService;
import com.dangvandat.service.impl.CalendarService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dangvandat.util.formUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/api-search"})
public class CalendarAPI extends HttpServlet {

    private ICalendarService calendarService;

    public CalendarAPI(){
        if(calendarService == null){
            calendarService = new CalendarService();
        }
    }

    protected void doGet(HttpServletRequest request , HttpServletResponse reponse)
            throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        request.setCharacterEncoding("utf-8");
        reponse.setContentType("application/json");
        CalendarDTO model = formUtil.toModel(CalendarDTO.class , request);
        SearchTeacher searchTeacher = initSearch(model);
        Pageble pageble = new PageRequest(null , null , null);
        model.setListResult(calendarService.findAll(searchTeacher , pageble));
        mapper.writeValue(reponse.getOutputStream(), model.getListResult());
    }

    private SearchTeacher initSearch(CalendarDTO model){
        SearchTeacher searchTeacher = new SearchTeacher.Search()
                .setCodeClass(model.getCodeClass())
                .setCodeTern(model.getCodeTern())
                .setRoomName(model.getRoomName())
                .setSubjectCodeClass(model.getSubjectCodeClass())
                .setSubjectsCode(model.getSubjectsCode())
                .search();
        return searchTeacher;
    }
}
