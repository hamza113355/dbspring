package com.dbms.project1.v1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "score_grade")
public class ScoreGrade {
    @Id
    private double score;

    private String letterGrade;

    public ScoreGrade() {
        super();
    }

    public ScoreGrade(double score, String letterGrade) {
        super();
        this.score = score;
        this.letterGrade = letterGrade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    @Override
    public String toString() {
        return "ScoreGrade [score=" + score + ", letterGrade=" + letterGrade + "]";
    }
}
