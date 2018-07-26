package org.perscholas.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files_4 {
	
	

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		Student[] students=new Student[10];
		for (int n=0; n<students.length; n++) {
	    students[n]=new Student();
		}
	    System.out.println(students[0].getGpa());
		
		String nameFile="C:\\Users\\Robyn\\eclipse-workspace\\PerScholas\\src\\org\\perscholas\\files\\name";
		String gradeFile="C:\\Users\\Robyn\\eclipse-workspace\\PerScholas\\src\\org\\perscholas\\files\\grade";
		String gpaFile="C:\\Users\\Robyn\\eclipse-workspace\\PerScholas\\src\\org\\perscholas\\files\\gpa";
		
		File namef=new File(nameFile);
		File gradef= new File(gradeFile);	
		File gpaf = new File(gpaFile);
		try {
		FileWriter	writer = new FileWriter(namef, true);
		for(int m=0; m<students.length; m++) {
		writer.write(students[m].getName() + "\n");
		}
		
		FileWriter writergrade=new FileWriter(gradef, true);
		for(int k=0; k< students.length; k++) {
		writergrade.write(students[k].getGrade() + "\n");
		}
	
		FileWriter writergpa=new FileWriter(gpaf, true);
		for(int p=0; p<students.length; p++) {
		writergpa.write(String.valueOf(students[p].getGpa()) + "\n");
		}
		writer.close();
		writergrade.close();
		writergpa.close();
		} catch (IOException e) {
			System.out.println("Can't find file.");
			e.printStackTrace();
		}
		}
		
		
		

	}

