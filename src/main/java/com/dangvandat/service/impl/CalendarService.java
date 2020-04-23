package com.dangvandat.service.impl;

import com.dangvandat.converter.CalendarConverter;
import com.dangvandat.dto.CalendarDTO;
import com.dangvandat.paging.Pageble;
import com.dangvandat.repository.ICalendarRepository;
import com.dangvandat.repository.impl.CalendarRepository;
import com.dangvandat.search.SearchTeacher;
import com.dangvandat.service.ICalendarService;

import java.util.List;
import java.util.stream.Collectors;

public class CalendarService implements ICalendarService {

    ICalendarRepository calendarRepository = new CalendarRepository();

    CalendarConverter calendarConverter = new CalendarConverter();

    @Override
    public List<CalendarDTO> findAll(SearchTeacher searchTeacher, Pageble pageble) {
        return calendarRepository.findAll(searchTeacher , pageble)
                .stream().map(item -> calendarConverter.convertToDTO(item))
                .collect(Collectors.toList());
    }
}
