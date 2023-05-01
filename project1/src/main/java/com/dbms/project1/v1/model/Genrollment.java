package com.dbms.project1.v1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "g_enrollments")
public class Genrollment {
    @Id
    private String gBNumber;

    private String classId;

    private double score;

    public Genrollment() {
        super();
    }

    public Genrollment(String gBNumber, String classId, double score) {
        super();
        this.gBNumber = gBNumber;
        this.classId = classId;
        this.score = score;
    }

    public String getGBNumber() {
        return gBNumber;
    }

    public void setGBNumber(String gBNumber) {
        this.gBNumber = gBNumber;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Genrollment [gBNumber=" + gBNumber + ", classId=" + classId + ", score=" + score + "]";
    }
}
