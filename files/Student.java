package org.perscholas.files;

import java.util.Scanner;

public class Student {
	String name;
	int grade;
	double gpa;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public void getInfo() {
		System.out.println("My name is" + getName() + " .  I'm in grade " + getGrade() + " and I have a " + getGpa() + ".  For now, at least....");
	}
	public Student() {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter Name:");
		setName(reader.nextLine());
		System.out.println("Enter Grade:");
		setGrade(reader.nextInt());
		System.out.println("Enter GPA:");
		setGpa(reader.nextDouble());
		
		
	}
}
