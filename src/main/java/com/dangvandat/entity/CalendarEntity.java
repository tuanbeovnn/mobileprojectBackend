package com.dangvandat.entity;

import com.dangvandat.annotation.Column;
import com.dangvandat.annotation.Entity;
import com.dangvandat.annotation.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "calendar")
public class CalendarEntity extends BaseEntity{

    @Column(name = "idteacher")
    private String idTeacher;

    @Column(name = "name")
    private String name;

    @Column(name = "namebatch")
    private String nameBath;

    @Column(name = "subjectscode")
    private String subjectsCode;

    @Column(name = "codetern")
    private String codeTern;

    @Column(name = "subjectcodeclass")
    private String subjectCodeClass;

    @Column(name = "subjectsname")
    private String subjectsName;

    @Column(name = "nameclass")
    private String nameClass;

    @Column(name = "codeclass")
    private String codeClass;

    @Column(name = "creditsnumber")
    private Integer creditsNumber;

    @Column(name = "peoplenumber")
    private Integer peopleNumber;

    @Column(name = "things")
    private String things;

    @Column(name = "lessonform")
    private Integer lessonForm;

    @Column(name = "lessontorm")
    private Integer lessonTo;

    @Column(name = "totallesson")
    private Integer totalLesson;

    @Column(name = "roomname")
    private String roomName;

    @Column(name = "dayteach")
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

    public Integer getCreditsNumber() {
        return creditsNumber;
    }

    public void setCreditsNumber(Integer creditsNumber) {
        this.creditsNumber = creditsNumber;
    }

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public String getThings() {
        return things;
    }

    public void setThings(String things) {
        this.things = things;
    }

    public Integer getLessonForm() {
        return lessonForm;
    }

    public void setLessonForm(Integer lessonForm) {
        this.lessonForm = lessonForm;
    }

    public Integer getLessonTorm() {
        return lessonTo;
    }

    public void setLessonTorm(Integer lessonTorm) {
        this.lessonTo = lessonTorm;
    }

    public Integer getTotalLesson() {
        return totalLesson;
    }

    public void setTotalLesson(Integer totalLesson) {
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
