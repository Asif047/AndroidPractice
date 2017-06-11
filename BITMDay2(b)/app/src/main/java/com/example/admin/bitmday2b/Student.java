package com.example.admin.bitmday2b;

import java.io.Serializable;

/**
 * Created by admin on 6/9/2017.
 */

public class Student implements Serializable{

    private String FirstName;
    private String LastName;
    private StudentAddress studentaddress;
    private String PhoneNumber;
    private Department department;

    public Student(String firstName, String lastName, StudentAddress studentaddress, String phoneNumber, Department department) {
        FirstName = firstName;
        LastName = lastName;
        this.studentaddress = studentaddress;
        PhoneNumber = phoneNumber;
        this.department = department;
    }

    public Student(String firstName, String lastName, StudentAddress studentaddress, String phoneNumber) {
        FirstName = firstName;
        LastName = lastName;
        this.studentaddress = studentaddress;
        PhoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public StudentAddress getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(StudentAddress studentaddress) {
        this.studentaddress = studentaddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return FirstName+" ,"+LastName+" ,"+studentaddress+" ,"+PhoneNumber;
    }
}
