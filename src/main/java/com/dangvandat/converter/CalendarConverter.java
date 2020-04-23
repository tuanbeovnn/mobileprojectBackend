package com.dangvandat.converter;

import com.dangvandat.dto.CalendarDTO;
import com.dangvandat.entity.CalendarEntity;
import org.apache.commons.lang.StringUtils;
import org.modelmapper.ModelMapper;

public class CalendarConverter {

    public CalendarDTO convertToDTO(CalendarEntity calendarEntity){
        ModelMapper modelMapper = new ModelMapper();
        CalendarDTO result = modelMapper.map(calendarEntity , CalendarDTO.class);
        return result;
    }

    public CalendarEntity convertToEntity(CalendarDTO calendarDTO){
        ModelMapper modelMapper = new ModelMapper();
        CalendarEntity result = modelMapper.map(calendarDTO , CalendarEntity.class);
        if(StringUtils.isNotBlank(calendarDTO.getLessonForm())){
            result.setLessonForm(Integer.parseInt(calendarDTO.getLessonForm()));
        }
        if(StringUtils.isNotBlank(calendarDTO.getLessonTo())){
            result.setLessonTorm(Integer.parseInt(calendarDTO.getLessonTo()));
        }
        if(StringUtils.isNotBlank(calendarDTO.getTotalLesson())){
            result.setTotalLesson(Integer.parseInt(calendarDTO.getTotalLesson()));
        }
        if(StringUtils.isNotBlank(calendarDTO.getCreditsNumber())){
            result.setCreditsNumber(Integer.parseInt(calendarDTO.getCreditsNumber()));
        }
        if(StringUtils.isNotBlank(calendarDTO.getPeopleNumber())){
            result.setPeopleNumber(Integer.parseInt(calendarDTO.getPeopleNumber()));
        }
        return result;
    }

}
