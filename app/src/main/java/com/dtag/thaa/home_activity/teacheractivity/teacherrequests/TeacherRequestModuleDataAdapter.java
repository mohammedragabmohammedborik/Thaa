package com.dtag.thaa.home_activity.teacheractivity.teacherrequests;

import java.io.Serializable;

public class TeacherRequestModuleDataAdapter implements Serializable {

    private  String studentName,courseName;
    private  String status;
    private  int  id;

    public TeacherRequestModuleDataAdapter(String studentName,String courseName, String status, int id) {
        this.studentName = studentName;
        this.courseName=courseName;
        this.status = status;
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
