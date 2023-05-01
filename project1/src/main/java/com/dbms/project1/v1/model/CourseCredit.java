package com.dbms.project1.v1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "course_credit")
public class CourseCredit {
    @Id
    private int courseNumber;


    private int credits;

    public CourseCredit() {
        super();
    }

    public CourseCredit(int courseNumber, int credits) {
        super();
        this.courseNumber = courseNumber;
        this.credits = credits;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "CourseCredit [courseNumber=" + courseNumber + ", credits=" + credits + "]";
    }
}
