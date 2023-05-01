package com.dbms.project1.v1.api;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dbms.project1.v1.model.Classes;
import com.dbms.project1.v1.model.Course;
import com.dbms.project1.v1.model.CourseCredit;
import com.dbms.project1.v1.model.Genrollment;
import com.dbms.project1.v1.model.Prerequisite;
import com.dbms.project1.v1.model.ScoreGrade;
import com.dbms.project1.v1.model.Student;
import com.dbms.project1.v1.repository.StudentRepository;
import java.util.HashMap;
import java.util.Map;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

//    @GetMapping("/students")
//    @CrossOrigin(origins = "http://localhost:3000")
//    public List<Student> getAllStudents() {
//        System.out.println("here=================================");
//        
//        return studentRepository.findAlls();
//        
//    }
    
    @GetMapping("/students")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Object> getAllStudents() {
        try {
            List<Student> students = studentRepository.findAlls();
            return ResponseEntity.ok(students);
        } catch (Exception e) {
//            String errorMessage = "An error occurred while fetching students: " + e.getMessage();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
        	String errorMessage = "An error occurred while fetching students: " + e.getMessage();
            Map<String, String> errorBody = new HashMap<>();
            errorBody.put("error", errorMessage);
            return ResponseEntity
            		  .status(HttpStatus.INTERNAL_SERVER_ERROR)
            		  .body(errorBody);
        }
    }
    
    @PostMapping("/deletestudents/{bNumber}")
    public String deleteStudentByBNumber(@PathVariable String bNumber) {
        return studentRepository.deletestudent(bNumber);
    }
    
    @PostMapping("/showstudentsinclass/{classid}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Object> showstudentsinclass(@PathVariable String classid) {
        try {
            List<Student> students = studentRepository.showstudentsinclass(classid);
            return ResponseEntity.ok(students);
        } catch (Exception e) {
//            String errorMessage = "An error occurred while fetching students: " + e.getMessage();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
        	String errorMessage = "An error occurred while fetching students: " + e.getMessage();
            Map<String, String> errorBody = new HashMap<>();
            errorBody.put("error", errorMessage);
            return ResponseEntity
            		  .status(HttpStatus.INTERNAL_SERVER_ERROR)
            		  .body(errorBody);
        }
    }
    
    @PostMapping("/enrollstudentinclass/{bid}/{classid}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Object> enrollstudentinclass(@PathVariable String bid, @PathVariable String classid) {
        try {
            String students = studentRepository.enrollstudentinclass(classid, bid);
            return ResponseEntity.ok(students);
        } catch (Exception e) {
//            String errorMessage = "An error occurred while fetching students: " + e.getMessage();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
        	String errorMessage = "An error occurred while fetching students: " + e.getMessage();
            Map<String, String> errorBody = new HashMap<>();
            errorBody.put("error", errorMessage);
            return ResponseEntity
            		  .status(HttpStatus.INTERNAL_SERVER_ERROR)
            		  .body(errorBody);
        }
    }
    
    
    @GetMapping("/courses")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Course> allcourses() {
        System.out.println("here=================================");
        
        return studentRepository.allcourses();
        
    }
    
    @GetMapping("/classes")
    public List<Classes> allclasses() {
        System.out.println("here=================================");
        
        return studentRepository.allclasses();
        
    }
    
    @GetMapping("/coursecredits")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<CourseCredit> allcoursecredits() {
        System.out.println("here=================================");
        
        return studentRepository.allcoursecredits();
        
    }
    
    @GetMapping("/scoregrade")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<ScoreGrade> allscoregrade() {
        System.out.println("here=================================");
        
        return studentRepository.allscoregrade();
        
    }
//    
//    @GetMapping("/g_enrollments")
//    @CrossOrigin(origins = "http://localhost:3000")
//    public List<Genrollment> allgenrollments() throws Exception {
//        System.out.println("here=================================");
//        
//        return studentRepository.allgenrollments();
//        
//    }
    
    @GetMapping("/g_enrollments")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Object> allgenrollments() {
        try {
        	List<Genrollment>  gens = studentRepository.allgenrollments();
            return ResponseEntity.ok(gens);
        } catch (Exception e) {
        	String errorMessage = "An error occurred while fetching students: " + e.getMessage();
            Map<String, String> errorBody = new HashMap<>();
            errorBody.put("error", errorMessage);
            return ResponseEntity
            		  .status(HttpStatus.INTERNAL_SERVER_ERROR)
            		  .body(errorBody);
        }
    }
    
    
    @GetMapping("/pre_requisites")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Object> allprerequisites() {
        try {
        	List<Prerequisite>  gens = studentRepository.allprerequisites();
            return ResponseEntity.ok(gens);
        } catch (Exception e) {
        	String errorMessage = "An error occurred while fetching students: " + e.getMessage();
            Map<String, String> errorBody = new HashMap<>();
            errorBody.put("error", errorMessage);
            return ResponseEntity
            		  .status(HttpStatus.INTERNAL_SERVER_ERROR)
            		  .body(errorBody);
        }
    }
    
    

}
