package com.dbms.project1.v1.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dbms.project1.v1.model.Classes;
import com.dbms.project1.v1.model.Course;
import com.dbms.project1.v1.model.CourseCredit;
import com.dbms.project1.v1.model.Genrollment;
import com.dbms.project1.v1.model.Prerequisite;
import com.dbms.project1.v1.model.ScoreGrade;
import com.dbms.project1.v1.model.Student;

@Repository
public interface DbmsDaoInterface {
	public List<Student> findallstudents() throws SQLException;
	public String deletestudents(String bNumber) throws SQLException;
	List<Course> findallcourses() throws SQLException;
	List<Classes> findAllclasses() throws SQLException;
	List<CourseCredit> findAllCourseCredits() throws SQLException;
	public List<ScoreGrade> findAllScoreGrade() throws SQLException;
	public List<Student> showstudentsinclass(String classid) throws SQLException;
	public String enrollstudentinclass(String classid, String bid) throws SQLException;
	
	public List<Genrollment> allgenrollments() throws SQLException;
	public List<Prerequisite> allprerequisites() throws SQLException;

}
