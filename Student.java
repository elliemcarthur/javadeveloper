package org.perscholas.files;

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
		this.grade =grade;
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

}
