package com.dangvandat.dto;

import java.sql.Timestamp;

public class CalendarDTO extends AbstractDTO<CalendarDTO>{
    private String idTeacher;
    private String name;
    private String nameBath;
    private String subjectsCode;
    private String codeTern;
    private String subjectCodeClass;
    private String subjectsName;
    private String nameClass;
    private String codeClass;
    private String creditsNumber;
    private String peopleNumber;
    private String things;
    private String lessonForm;
    private String lessonTo;
    private String totalLesson;
    private String roomName;
    private Timestamp dayTeach;

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameBath() {
        return nameBath;
    }

    public void setNameBath(String nameBath) {
        this.nameBath = nameBath;
    }

    public String getSubjectsCode() {
        return subjectsCode;
    }

    public void setSubjectsCode(String subjectsCode) {
        this.subjectsCode = subjectsCode;
    }

    public String getCodeTern() {
        return codeTern;
    }

    public void setCodeTern(String codeTern) {
        this.codeTern = codeTern;
    }

    public String getSubjectCodeClass() {
        return subjectCodeClass;
    }

    public void setSubjectCodeClass(String subjectCodeClass) {
        this.subjectCodeClass = subjectCodeClass;
    }

    public String getSubjectsName() {
        return subjectsName;
    }

    public void setSubjectsName(String subjectsName) {
        this.subjectsName = subjectsName;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getCodeClass() {
        return codeClass;
    }

    public void setCodeClass(String codeClass) {
        this.codeClass = codeClass;
    }

    public String getCreditsNumber() {
        return creditsNumber;
    }

    public void setCreditsNumber(String creditsNumber) {
        this.creditsNumber = creditsNumber;
    }

    public String getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(String peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public String getThings() {
        return things;
    }

    public void setThings(String things) {
        this.things = things;
    }

    public String getLessonForm() {
        return lessonForm;
    }

    public void setLessonForm(String lessonForm) {
        this.lessonForm = lessonForm;
    }

    public String getLessonTo() {
        return lessonTo;
    }

    public void setLessonTo(String lessonTo) {
        this.lessonTo = lessonTo;
    }

    public String getTotalLesson() {
        return totalLesson;
    }

    public void setTotalLesson(String totalLesson) {
        this.totalLesson = totalLesson;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Timestamp getDayTeach() {
        return dayTeach;
    }

    public void setDayTeach(Timestamp dayTeach) {
        this.dayTeach = dayTeach;
    }
}
