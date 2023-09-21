package com.training.courseservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Student {

	public Student() {	}
	public Student(String studName, int age, String grade) {
		this.studName = studName;
		this.age = age;
		this.grade = grade;
	}
	
	private long studId;
	private String studName;
	private int age;
	private String grade;
	
	
	
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}