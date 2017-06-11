package com.example.admin.bitmday2b;

/**
 * Created by admin on 6/11/2017.
 */

public class Department {
    private String DepartmentName;
    private String HODName;
    private Course course;

    public Department(String departmentName, String HODName, Course course) {
        DepartmentName = departmentName;
        this.HODName = HODName;
        this.course = course;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getHODName() {
        return HODName;
    }

    public void setHODName(String HODName) {
        this.HODName = HODName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
