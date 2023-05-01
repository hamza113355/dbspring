package com.dbms.project1.v1.model;
import java.util.Objects;

public class Classes {
    private String classId;
    private String departmentCode;
    private int courseNumber;
    private int sectionNumber;
    private int year;
    private String semester;
    private int limit;
    private int class_size;
    private String room;
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public int getSectionNumber() {
		return sectionNumber;
	}
	public void setSectionNumber(int sectionNumber) {
		this.sectionNumber = sectionNumber;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getClass_size() {
		return class_size;
	}
	public void setClass_size(int class_size) {
		this.class_size = class_size;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public Classes(String classId, String departmentCode, int courseNumber, int sectionNumber, int year,
			String semester, int limit, int class_size, String room) {
		super();
		this.classId = classId;
		this.departmentCode = departmentCode;
		this.courseNumber = courseNumber;
		this.sectionNumber = sectionNumber;
		this.year = year;
		this.semester = semester;
		this.limit = limit;
		this.class_size = class_size;
		this.room = room;
	}
	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", departmentCode=" + departmentCode + ", courseNumber=" + courseNumber
				+ ", sectionNumber=" + sectionNumber + ", year=" + year + ", semester=" + semester + ", limit=" + limit
				+ ", class_size=" + class_size + ", room=" + room + "]";
	}

	

}
