package com.training.courseservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
public Course() {
	// TODO Auto-generated constructor stub
}
	public Course(String courseName, int credits, String courseCode) {

	this.courseName = courseName;
	this.credits = credits;
	this.courseCode = courseCode;
}
	
	
	private String courseName;
	private int credits;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private String courseCode;
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
