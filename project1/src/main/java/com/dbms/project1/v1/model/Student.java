package com.dbms.project1.v1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;


@Entity
@Table(name = "Students")
public class Student {
	  	@Id
	    @Column(name = "B#")
	    private String bNumber;
	    
	    @Column(name = "first_name")
	    private String firstName;
	    
	    @Column(name = "last_name")
	    private String lastName;
	    
	    @Column(name = "st_level")
	    private String level;
	    
	    @Column(name = "gpa")
	    private Double gpa;
	    
	    @Column(name = "email")
	    private String email;
	    
	    @Column(name = "bdate")
	    @Temporal(TemporalType.DATE)
	    private Date birthDate;

		
	    public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
	    

		@Override
		public String toString() {
			return "Student [bNumber=" + bNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", level="
					+ level + ", gpa=" + gpa + ", email=" + email + ", birthDate=" + birthDate + "]";
		}


		public Student(String bNumber, String firstName, String lastName, String level, Double gpa, String email,
				Date birthDate) {
			super();
			this.bNumber = bNumber;
			this.firstName = firstName;
			this.lastName = lastName;
			this.level = level;
			this.gpa = gpa;
			this.email = email;
			this.birthDate = birthDate;
		}

		public Student(String bNumber, String firstName, String lastName) {
			super();
			this.bNumber = bNumber;
			this.firstName = firstName;
			this.lastName = lastName;
//			this.level = level;
//			this.gpa = gpa;
//			this.email = email;
//			this.birthDate = birthDate;
		}
		
//		public Student(String string, String string2, String string3) {
//			// TODO Auto-generated constructor stub
//	    	
//		}

		public String getbNumber() {
			return bNumber;
		}

		public void setbNumber(String bNumber) {
			this.bNumber = bNumber;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getLevel() {
			return level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Double getGpa() {
			return gpa;
		}

		public void setGpa(Double gpa) {
			this.gpa = gpa;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Date getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(Date birthDate) {
			this.birthDate = birthDate;
		}
	

}
