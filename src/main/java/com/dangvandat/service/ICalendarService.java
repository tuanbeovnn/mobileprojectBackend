package com.dangvandat.service;

import com.dangvandat.dto.CalendarDTO;
import com.dangvandat.paging.Pageble;
import com.dangvandat.search.SearchTeacher;

import java.util.List;

public interface ICalendarService {

    List<CalendarDTO> findAll(SearchTeacher searchTeacher , Pageble pageble);
}
