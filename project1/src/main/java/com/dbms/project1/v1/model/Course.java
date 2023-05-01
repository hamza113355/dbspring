package com.dbms.project1.v1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @Column(name = "dept_code")
    private String deptCode;

    @Id
    @Column(name = "course#")
    private int courseNumber;

    @Column(name = "title")
    private String title;

    public Course() {}

    public Course(String deptCode, int courseNumber, String title) {
        this.deptCode = deptCode;
        this.courseNumber = courseNumber;
        this.title = title;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Course [deptCode=" + deptCode + ", courseNumber=" + courseNumber + ", title=" + title + "]";
    }
}
