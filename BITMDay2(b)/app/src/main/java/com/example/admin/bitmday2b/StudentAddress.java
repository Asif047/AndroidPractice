package com.example.admin.bitmday2b;

import java.io.Serializable;

/**
 * Created by admin on 6/9/2017.
 */

public class StudentAddress implements Serializable {

    private String HouseNo;
    private String RoadNo;
    private String City;
    private String ZipCode;

    public StudentAddress(String houseNo, String roadNo, String city, String zipCode) {
        HouseNo = houseNo;
        RoadNo = roadNo;
        City = city;
        ZipCode = zipCode;
    }

    public String getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(String houseNo) {
        HouseNo = houseNo;
    }

    public String getRoadNo() {
        return RoadNo;
    }

    public void setRoadNo(String roadNo) {
        RoadNo = roadNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    @Override
    public String toString() {
        return HouseNo+" ,"+RoadNo+" ,"+City+" ,"+ZipCode;
    }
}
