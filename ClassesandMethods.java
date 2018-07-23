package org.perscholas.lms.homework5;


import java.util.Scanner;

public class ClassesandMethods {


	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		char agreetocreate;
		System.out.println("Hello, you can add three students at a time.\n "
				+ "Would you like to create student#1's profile now? Y/N?");
		String userinput=reader.nextLine();
		if(userinput.equals("Y")) {
			
		}else {
			System.out.println("End of program....");
		}
		System.out.println("Enter name");
		Student student1=new Student();
		student1.setName(reader.nextLine());
		System.out.println("Enter grade.");
		student1.setGrade(reader.nextLine().charAt(0));
		System.out.println("Enter GPA");
		student1.setGPA(reader.nextDouble());
	
	}

}