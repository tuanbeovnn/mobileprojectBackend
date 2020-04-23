package com.dangvandat.search;

public class SearchTeacher {

    private String roomName;
    private String subjectsCode;
    private String codeTern;
    private String subjectCodeClass;
    private String codeClass;

    public String getRoomName() {
        return roomName;
    }
    public String getSubjectsCode() {
        return subjectsCode;
    }
    public String getCodeTern() {
        return codeTern;
    }
    public String getSubjectCodeClass() {
        return subjectCodeClass;
    }
    public String getCodeClass() {
        return codeClass;
    }

    public SearchTeacher(Search search){
        this.roomName = search.roomName;
        this.subjectsCode = search.subjectsCode;
        this.codeTern = search.codeTern;
        this.subjectCodeClass = search.subjectCodeClass;
        this.codeClass = search.codeClass;
    }

    public static class Search{
        private String roomName;
        private String subjectsCode;
        private String codeTern;
        private String subjectCodeClass;
        private String codeClass;

        public Search setRoomName(String roomName) {
            this.roomName = roomName;
            return this;
        }

        public Search setSubjectsCode(String subjectsCode) {
            this.subjectsCode = subjectsCode;
            return this;
        }

        public Search setCodeTern(String codeTern) {
            this.codeTern = codeTern;
            return this;
        }

        public Search setSubjectCodeClass(String subjectCodeClass) {
            this.subjectCodeClass = subjectCodeClass;
            return this;
        }

        public Search setCodeClass(String codeClass) {
            this.codeClass = codeClass;
            return this;
        }

        public SearchTeacher search(){return new SearchTeacher(this);}
    }
}
