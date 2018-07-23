package org.perscholas.lms.homework5;

public class Student {
	private String name;
	private char grade;
	private double gpa;
	
	public String getName() {
		return this.name;
	}
	
	public char grade() {
		return this.grade;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setGrade(char grade) {
		this.grade=grade;
	}
	
	public void setGPA(double gpa) {
		this.gpa=gpa;
	}
}
