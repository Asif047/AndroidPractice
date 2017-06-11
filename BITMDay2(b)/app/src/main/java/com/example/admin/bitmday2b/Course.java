package com.example.admin.bitmday2b;

/**
 * Created by admin on 6/11/2017.
 */

public class Course {

    private String CourseNo;
    private String CourseName;
    private double CourseCredit;

    public Course(String courseNo, String courseName, double courseCredit) {
        CourseNo = courseNo;
        CourseName = courseName;
        CourseCredit = courseCredit;
    }

    public String getCourseNo() {
        return CourseNo;
    }

    public void setCourseNo(String courseNo) {
        CourseNo = courseNo;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public double getCourseCredit() {
        return CourseCredit;
    }

    public void setCourseCredit(double courseCredit) {
        CourseCredit = courseCredit;
    }
}
