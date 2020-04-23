package com.dangvandat.repository;

import com.dangvandat.entity.CalendarEntity;
import com.dangvandat.paging.Pageble;
import com.dangvandat.search.SearchTeacher;

import java.util.List;

public interface ICalendarRepository extends GenericJDBC<CalendarEntity> {
    List<CalendarEntity> findAll(SearchTeacher searchTeacher , Pageble pageble);
}
