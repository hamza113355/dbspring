package com.dbms.project1.v1.dao;

import java.sql.CallableStatement;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dbms.project1.v1.model.Classes;
import com.dbms.project1.v1.model.Course;
import com.dbms.project1.v1.model.CourseCredit;
import com.dbms.project1.v1.model.Genrollment;
import com.dbms.project1.v1.model.Prerequisite;
import com.dbms.project1.v1.model.ScoreGrade;
import com.dbms.project1.v1.model.Student;

import oracle.jdbc.pool.OracleDataSource;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.pool.OracleDataSource;
import oracle.jdbc.*;
import java.sql.*;


public class DbmsDaoImplememts implements DbmsDaoInterface{

	@Override
	public List<Student> findallstudents() throws SQLException {
		 List<Student> students = new ArrayList<>();

		   
	 	OracleDataSource ds = new oracle.jdbc.pool.OracleDataSource();
	 	ds.setURL("jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:ACAD111");
//	 	Connection conn = ds.getConnection("asutari1", "as979752");
	 //	Connection conn = ds.getConnection("vborra", "Deadpool2210");
	 	Connection conn = ds.getConnection("hazhar1", "nust111333");
	 	
	 	try (PreparedStatement statement = conn.prepareStatement("SELECT * FROM Students");
	 	     ResultSet resultSet = statement.executeQuery()) {
	 	    while (resultSet.next()) {
	 	        String bNumber = resultSet.getString("B#");
	 	        String firstName = resultSet.getString("first_name");
	 	        String lastName = resultSet.getString("last_name");
	 	        String level = resultSet.getString("st_level");
	 	        Double gpa = resultSet.getDouble("gpa");
	 	        String email = resultSet.getString("email");
	 	        Date birthDate = resultSet.getDate("bdate");

	 	        Student student = new Student(bNumber, firstName, lastName, level, gpa, email, birthDate);
	 	        System.out.println(student.toString());
	 	        students.add(student);
	 	    }
	 	} catch (SQLException e) {
	 	    // handle exception
	 	    System.out.println("Sorry, Could not find students, please try after some time;");
	 	    throw new SQLException(e.getMessage());
	 	    //return e.getMessage();
	 	} finally {
	 	    conn.close();
	 	}

	 return students;
	}
	
	@Override
	public String deletestudents(String bNumber) throws SQLException {
	    OracleDataSource ds = new oracle.jdbc.pool.OracleDataSource();
	    ds.setURL("jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:ACAD111");
	    // Connection conn = ds.getConnection("vborra", "Deadpool2210");
//	    Connection conn = ds.getConnection("asutari1", "as979752");
	    Connection conn = ds.getConnection("hazhar1", "nust111333");
	    
	    try (PreparedStatement statement = conn.prepareStatement("DELETE FROM students WHERE B# like ?");
//	    try (PreparedStatement statement = conn.prepareStatement("DELETE FROM students WHERE B# like ? CASCADE");

	         ){
	        statement.setString(1, bNumber);
	      
	        System.out.println("query for deletestudents : " + statement.toString());
	        int rowsDeleted = statement.executeUpdate();
	        if (rowsDeleted == 0) {
	            System.out.println("No student with B# " + bNumber + " found in the database.");
	        } else {
	            System.out.println("Student with B# " + bNumber + " has been deleted from the database.");
	        }
	    } catch (SQLException e) {

	    	System.out.println(e.getMessage());
	        // handle exception
	        System.out.println("Sorry, could not delete student, please try after some time.");
	    	return e.getMessage();
	    	} finally {
	        conn.close();
	    }
		return bNumber;
	
	}
	
	
	@Override
	public List<Course> findallcourses() throws SQLException {
	    List<Course> courses = new ArrayList<>();
	    OracleDataSource ds = new oracle.jdbc.pool.OracleDataSource();
	    ds.setURL("jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:ACAD111");
	    //Connection conn = ds.getConnection("vborra", "Deadpool2210");
	    //Connection conn = ds.getConnection("hazhar1", "nust111333");
	    Connection conn = ds.getConnection("sdorbal1", "ef32Jr@Bing#");
	    
	    try (PreparedStatement statement = conn.prepareStatement("SELECT * FROM Courses");
	         ResultSet resultSet = statement.executeQuery()) {
	        while (resultSet.next()) {
	            String deptCode = resultSet.getString("dept_code");
	            int courseNumber = resultSet.getInt("course#");
	            String title = resultSet.getString("title");

	            Course course = new Course(deptCode, courseNumber, title);
	            System.out.println(course.toString());
	            courses.add(course);
	        }
	    } catch (SQLException e) {
	        // handle exception
	        System.out.println("Sorry, Could not find courses, please try after some time;");
	    } finally {
	        conn.close();
	    }

	    return courses;
	}
	
	
	
	@Override
	public List<Classes> findAllclasses() throws SQLException {
	    List<Classes> classes = new ArrayList<>();

	    OracleDataSource ds = new oracle.jdbc.pool.OracleDataSource();
	    ds.setURL("jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:ACAD111");
	    Connection conn = ds.getConnection("vborra", "Deadpool2210");
	    
	    try (PreparedStatement statement = conn.prepareStatement("SELECT * FROM classes");
	         ResultSet resultSet = statement.executeQuery()) {
	        while (resultSet.next()) {
	            
	        	 String classId = resultSet.getString("classid");
	             String departmentCode = resultSet.getString("dept_code");
	             int courseNumber = resultSet.getInt("course#");
	             int sectionNumber = resultSet.getInt("sect#");
	             int year = resultSet.getInt("year");
	             String semester = resultSet.getString("semester");
	             int limit = resultSet.getInt("limit");
	             int class_size = resultSet.getInt("class_size");
	             String room = resultSet.getString("room");

	             Classes classo = new Classes(classId, departmentCode, courseNumber, sectionNumber, year, semester, limit, class_size, room);
	             
	             System.out.println(classo.toString());
	             classes.add(classo);
	        }
	    } catch (SQLException e) {
	    	System.out.println("class error-----");
	    	System.out.println(e.getMessage());
	    	System.out.println("class error-----");
	    	
	        System.out.println("Sorry, could not find class , please try again later.");
	    } finally {
	        conn.close();
	    }

	    return classes;
	}
	

	@Override
	public List<CourseCredit> findAllCourseCredits() throws SQLException {
	    List<CourseCredit> courseCredits = new ArrayList<>();

	    OracleDataSource ds = new oracle.jdbc.pool.OracleDataSource();
	    ds.setURL("jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:ACAD111");
	    //Connection conn = ds.getConnection("vborra", "Deadpool2210");
	    Connection conn = ds.getConnection("hazhar1", "nust111333");
	    
	    try (PreparedStatement statement = conn.prepareStatement("SELECT * FROM course_credit");
	         ResultSet resultSet = statement.executeQuery()) {
	        while (resultSet.next()) {
	            int courseNumber = resultSet.getInt("course#");
	            int credits = resultSet.getInt("credits");

	            CourseCredit courseCredit = new CourseCredit(courseNumber, credits);
	            courseCredits.add(courseCredit);
	        }
	    } catch (SQLException e) {
	        System.out.println("Sorry, could not find course credits, please try again later.");
	    } finally {
	        conn.close();
	    }

	    return courseCredits;
	}
	
	@Override
	public List<ScoreGrade> findAllScoreGrade() throws SQLException {
	    List<ScoreGrade> scoreGrades = new ArrayList<>();

	    OracleDataSource ds = new oracle.jdbc.pool.OracleDataSource();
	    ds.setURL("jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:ACAD111");
	    //Connection conn = ds.getConnection("vborra", "Deadpool2210");
	    Connection conn = ds.getConnection("hazhar1", "nust111333");
	    
	    try (PreparedStatement statement = conn.prepareStatement("SELECT * FROM score_grade");
	         ResultSet resultSet = statement.executeQuery()) {
	        while (resultSet.next()) {
	            double score = resultSet.getDouble("score");
	            String letterGrade = resultSet.getString("lgrade");

	            ScoreGrade scoreGrade = new ScoreGrade(score, letterGrade);
	            scoreGrades.add(scoreGrade);
	        }
	    } catch (SQLException e) {
	        System.out.println("Sorry, could not find score grades, please try again later.");
	    } finally {
	        conn.close();
	    }

	    return scoreGrades;
	}
	

	@Override
	public List<Student> showstudentsinclass(String classid) throws SQLException {
		List<Student> students = new ArrayList<>();
	 	Connection conn = null;
		OracleDataSource ds=null;
		
	 	try {	
	 			ds = new oracle.jdbc.pool.OracleDataSource();
	 		 	ds.setURL("jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:ACAD111");
	 		 	//conn = ds.getConnection("sdorbal1", "efJr@Bing#");
	 		 	conn = ds.getConnection("hazhar1", "nust111333");
	 		 	//conn = ds.getConnection("vborra", "Deadpool2210");
	 		 	
	            CallableStatement stmt = conn.prepareCall("{call course_management.show_students_in_class(?, ?)}");    
	            stmt.setString(1, classid);
	 			stmt.registerOutParameter(2, OracleTypes.CURSOR);
	 	        stmt.execute();
	 	        ResultSet resultSet = (ResultSet) stmt.getObject(2);
	 	        System.out.println("=============================Demo Run==========================");
	 	        
	 	        while (resultSet.next()) {
	           
	 	        String bNumber = resultSet.getString("B#");
	 	        String firstName = resultSet.getString("first_name");
	 	        String lastName = resultSet.getString("last_name");

	 	        Student student = new Student(bNumber, firstName, lastName);
	 	        System.out.println(student.toString());
	 	        students.add(student);
	 	    }
	 	} catch (SQLException e) {
	 	    // handle exception
	 	    System.out.println("Sorry, Could not find students, please try after some time;");
	 	    throw new SQLException(e.getMessage());
	 	   
	 	} finally {
	 	    conn.close();
	 	}

	 	return students;
	}
	
	
	
	@Override
	public String enrollstudentinclass(String classid, String bid) throws SQLException {
		// Procedure parameters
        //String bNum = "B00000001"; // replace with valid B#
        //String classId = "c0008"; // replace with valid classid

        // JDBC objects
        Connection conn = null;
        CallableStatement stmt = null;

        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Open a connection to the Oracle database
//            conn = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:ACAD111", "vborra", "Deadpool2210");
            
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:ACAD111", "hazhar1", "nust111333");

            // Prepare the procedure call
            String sql = "{CALL course_management.enroll_student(?, ?)}";
            stmt = conn.prepareCall(sql);

            // Set the input parameters
            stmt.setString(1, bid);
            stmt.setString(2, classid);
            
            stmt.execute();

            // Print success message
            System.out.println("Enrollment completed successfully.");
	           
	 	} catch (SQLException | ClassNotFoundException e) {
	 	    // handle exception
	 	    System.out.println("Sorry, Could not find students, please try after some time;");
	 	    throw new SQLException(e.getMessage());
	 	   
	 	} finally {
	 	    conn.close();
	 	}

	 	return "Student with bid " + bid + " is enrolled in class with classid " + classid;
	}

	
	
	@Override
	public List<Genrollment> allgenrollments() throws SQLException {
	    List<Genrollment> genrollments = new ArrayList<>();
	    Connection conn = null;
	    OracleDataSource ds = null;

	    try {
	        ds = new oracle.jdbc.pool.OracleDataSource();
	        ds.setURL("jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:ACAD111");
	        conn = ds.getConnection("hazhar1", "nust111333");

	        CallableStatement stmt = conn.prepareCall("{call course_management.show_g_enrollments(?)}");
	        stmt.registerOutParameter(1, OracleTypes.CURSOR);
	        stmt.execute();
	        ResultSet resultSet = (ResultSet) stmt.getObject(1);
	        System.out.println("=============================Demo Run==========================");

	        while (resultSet.next()) {

	            String gBNumber = resultSet.getString("G_B#");
	            String classId = resultSet.getString("classid");
	            double score = resultSet.getDouble("score");

	            Genrollment genrollment = new Genrollment(gBNumber, classId, score);
	            System.out.println(genrollment.toString());
	            genrollments.add(genrollment);
	        }
	    } catch (SQLException e) {
	        // handle exception
	        System.out.println("Sorry, Could not find genrollments, please try after some time;");
	        throw new SQLException(e.getMessage());

	    } finally {
	        conn.close();
	    }

	    return genrollments;
	}

	

	@Override
	public List<Prerequisite> allprerequisites() throws SQLException {
	    List<Prerequisite> prerequisites = new ArrayList<>();
	    Connection conn = null;
	    OracleDataSource ds = null;

	    try {
	        ds = new oracle.jdbc.pool.OracleDataSource();
	        ds.setURL("jdbc:oracle:thin:@castor.cc.binghamton.edu:1521:ACAD111");
	        conn = ds.getConnection("hazhar1", "nust111333");

	        CallableStatement stmt = conn.prepareCall("{call course_management.show_prerequisites(?)}");
	        stmt.registerOutParameter(1, OracleTypes.CURSOR);
	        stmt.execute();
	        ResultSet resultSet = (ResultSet) stmt.getObject(1);
	        System.out.println("=============================Demo Run==========================");

	        while (resultSet.next()) {
	            String deptCode = resultSet.getString("dept_code");
	            int courseNum = resultSet.getInt("course#");
	            String preDeptCode = resultSet.getString("pre_dept_code");
	            int preCourseNum = resultSet.getInt("pre_course#");

	            Prerequisite prerequisite = new Prerequisite(deptCode, courseNum, preDeptCode, preCourseNum);
	            System.out.println(prerequisite.toString());

	            // Retrieve prerequisites for the class
//	            PreparedStatement prerequisiteStmt = conn.prepareStatement(
//	                    "SELECT * FROM prerequisites WHERE classid = ?");
//	            prerequisiteStmt.setString(1, classId);
	            
//	            ResultSet prerequisiteResultSet = prerequisiteStmt.executeQuery();
//	            List<Prerequisite> prerequisites = new ArrayList<>();
//	            while (prerequisiteResultSet.next()) {
//	                String preDeptCode = prerequisiteResultSet.getString("pre_dept_code");
//	                int preCourseNumber = prerequisiteResultSet.getInt("pre_course_number");
//	                Prerequisite prerequisite = new Prerequisite(classId, preDeptCode, preCourseNumber);
//	                prerequisites.add(prerequisite);
//	            }
//	            genrollment.setPrerequisites(prerequisites);

	            prerequisites.add(prerequisite);
	        }
	    } catch (SQLException e) {
	        // handle exception
	        System.out.println("Sorry, Could not find genrollments, please try after some time;");
	        throw new SQLException(e.getMessage());

	    } finally {
	        conn.close();
	    }

	    return prerequisites;
	}




	
	


	
}
