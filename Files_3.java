package org.perscholas.files;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files_3 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		Student student1=new Student();
		System.out.println("Input Name.");
		student1.setName(reader.nextLine());
		System.out.println("Input Grade.");
		student1.setGrade(reader.nextLine().charAt(0));
		System.out.println("Input GPA.");
		student1.setGpa(reader.nextDouble());
		System.out.println(student1.getName());
		System.out.println(student1.getGrade());
		System.out.println(student1.getGpa());
		
		String nameFile="C:\\Users\\Robyn\\eclipse-workspace\\PerScholas\\src\\org\\perscholas\\files\\name";
		String gradeFile="C:\\Users\\Robyn\\eclipse-workspace\\PerScholas\\src\\org\\perscholas\\files\\grade";
		String gpaFile="C:\\Users\\Robyn\\eclipse-workspace\\PerScholas\\src\\org\\perscholas\\files\\gpa";
		
		File namef=new File(nameFile);
		File gradef= new File(gradeFile);	
		File gpaf = new File(gpaFile);
		try {
		FileWriter	writer = new FileWriter(namef, true);
		writer.write(student1.getName());
		
		
		FileWriter writergrade=new FileWriter(gradef, true);
		writergrade.write(student1.getGrade());
		
	
		FileWriter writergpa=new FileWriter(gpaf, true);
		writergpa.write(String.valueOf(student1.getGpa()));
		
		writer.close();
		writergrade.close();
		writergpa.close();
		} catch (IOException e) {
			System.out.println("Can't find file.");
			e.printStackTrace();
		}
		
		
		
		

	}

}
