package com.dbms.project1.v1.config;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Function;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.dbms.project1.v1.dao.DbmsDaoInterface;
import com.dbms.project1.v1.model.Classes;
import com.dbms.project1.v1.model.Course;
import com.dbms.project1.v1.model.CourseCredit;
import com.dbms.project1.v1.model.Genrollment;
import com.dbms.project1.v1.model.Prerequisite;
import com.dbms.project1.v1.model.ScoreGrade;
import com.dbms.project1.v1.model.Student;
import com.dbms.project1.v1.repository.StudentRepository;

import oracle.jdbc.pool.OracleDataSource;

import java.util.Date;

public class StudentRepositoryImpl implements StudentRepository {
   
	@Autowired
    DataSource dataSource;
	
	@Autowired
	DbmsDaoInterface dbdao;

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Student> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Student> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Student> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Student getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
//
//	@Override
//	public <S extends Student> List<S> findAll(Example<S> example) {
//		// TODO Auto-generated method stub
//
//      List<Student> students = new ArrayList<>();
//      students.add(new Student("John", "Doe", "john.doe@example.com"));
//      students.add(new Student("Jane", "Doe", "jane.doe@example.com"));
//      students.add(new Student("Bob", "Smith", "bob.smith@example.com"));
//      students.add(new Student("Alice", "Jones", "alice.jones@example.com"));
//      
//      return (List<S>) students;
////		return null;
//	}

	@Override
	public <S extends Student> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Student> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Student> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Student> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Student> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Student> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Student> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Student> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Student> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Student> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Student> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Student, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	@Override
	public String deletestudent(String bNumber) {
		// TODO Auto-generated method stub
	try {
		return dbdao.deletestudents(bNumber);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

	}

	
	@Override
	public List<Course> allcourses() {
		// TODO Auto-generated method stub
	try {
		return dbdao.findallcourses();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

	}
	
	

	@Override
	public List<Classes> allclasses() {
		// TODO Auto-generated method stub
	try {
		return dbdao.findAllclasses();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

	}
	

	

	@Override
	public List<ScoreGrade> allscoregrade() {
		// TODO Auto-generated method stub
	try {
		return dbdao.findAllScoreGrade();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

	}
	
	@Override
	public List<CourseCredit> allcoursecredits() {
		// TODO Auto-generated method stub
	try {
		return dbdao.findAllCourseCredits();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

	}

	
	
	@Override
	public void delete(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Student> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> showstudentsinclass(String classid) throws Exception {
		// TODO Auto-generated method stub
		try {
			return dbdao.showstudentsinclass(classid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		//return null;
	}
	
	@Override
	public String enrollstudentinclass(String classid, String bid) throws Exception {
		// TODO Auto-generated method stub
		try {
			return dbdao.enrollstudentinclass(classid, bid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		//return null;
	}

	@Override
	public List<Student> findAlls() throws Exception {
	   try {
		return dbdao.findallstudents();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new Exception(e.getMessage());
	}
	}
	


	@Override
	public List<Genrollment> allgenrollments() throws Exception {
	   try {
		return dbdao.allgenrollments();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new Exception(e.getMessage());
	}
	}

	
	@Override
	public List<Prerequisite> allprerequisites() throws Exception {
	   try {
		return dbdao.allprerequisites();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new Exception(e.getMessage());
	}
	}
	

}
