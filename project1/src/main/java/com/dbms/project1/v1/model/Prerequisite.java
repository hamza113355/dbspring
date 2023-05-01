package com.dbms.project1.v1.model;
public class Prerequisite {
    private String deptCode;
    private int courseNumber;
    private String preDeptCode;
    private int preCourseNumber;
    
    public Prerequisite(String deptCode, int courseNumber, String preDeptCode, int preCourseNumber) {
        this.deptCode = deptCode;
        this.courseNumber = courseNumber;
        this.preDeptCode = preDeptCode;
        this.preCourseNumber = preCourseNumber;
    }
    
    // Getters and setters
    
    public String getDeptCode() {
        return deptCode;
    }
    
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
    
    public int getCourseNumber() {
        return courseNumber;
    }
    
    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }
    
    public String getPreDeptCode() {
        return preDeptCode;
    }
    
    public void setPreDeptCode(String preDeptCode) {
        this.preDeptCode = preDeptCode;
    }
    
    public int getPreCourseNumber() {
        return preCourseNumber;
    }
    
    public void setPreCourseNumber(int preCourseNumber) {
        this.preCourseNumber = preCourseNumber;
    }
}
