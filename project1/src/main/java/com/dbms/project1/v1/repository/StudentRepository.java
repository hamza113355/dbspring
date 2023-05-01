package com.dbms.project1.v1.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.dbms.project1.v1.model.Classes;
import com.dbms.project1.v1.model.Course;
import com.dbms.project1.v1.model.CourseCredit;
import com.dbms.project1.v1.model.Genrollment;
import com.dbms.project1.v1.model.Prerequisite;
import com.dbms.project1.v1.model.ScoreGrade;
import com.dbms.project1.v1.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
	List<Student> findAlls() throws Exception;

	String deletestudent(String bNumber);

	List<Course> allcourses();

	List<Classes> allclasses();

	List<CourseCredit> allcoursecredits();

	List<ScoreGrade> allscoregrade();

	List<Student> showstudentsinclass(String classid) throws Exception;
	
	String enrollstudentinclass(String classid, String bid) throws Exception;

	List<Genrollment> allgenrollments() throws Exception;

	List<Prerequisite> allprerequisites() throws Exception;
	
}
