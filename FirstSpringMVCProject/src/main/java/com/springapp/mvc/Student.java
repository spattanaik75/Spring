package com.springapp.mvc;

/**
 * Created by user on 2014/12/01.
 */
public class Student {
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentHobby() {
        return studentHobby;
    }

    public void setStudentHobby(String studentHobby) {
        this.studentHobby = studentHobby;
    }

    private String studentName,studentHobby;
}
