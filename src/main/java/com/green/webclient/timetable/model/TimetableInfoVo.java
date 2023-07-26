package com.green.webclient.timetable.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TimetableInfoVo {
    private String schoolNm;
    private String semester;
    private String dayAndNight;
    private String grade;
    private int classNm;

    @JsonProperty("SCHUL_NM")
    public void setSchoolNm(String schoolNm) {
        this.schoolNm = schoolNm;
    }

    @JsonProperty("SEM")
    public void setSemester(String semester) {
        this.semester = semester;
    }

    @JsonProperty("DGHT_CRSE_SC_NM")
    public void setDayAndNight(String dayAndNight) {
        this.dayAndNight = dayAndNight;
    }

    @JsonProperty("GRADE")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @JsonProperty("CLASS_NM")
    public void setClassNm(int classNm) {
        this.classNm = classNm;
    }

    @JsonProperty("schoolNm")
    public String getSchoolNm() {
        return schoolNm;
    }

    @JsonProperty("semester")
    public String getSemester() {
        return semester;
    }

    @JsonProperty("dayAndNight")
    public String getDayAndNight() {
        return dayAndNight;
    }

    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    @JsonProperty("classNm")
    public int getClassNm() {
        return classNm;
    }
}
