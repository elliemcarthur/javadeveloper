package org.perscholas.files;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files_4 {
	
	public static Student inputAllInfo() {
		Scanner reader= new Scanner(System.in);
		Student student=new Student();
		System.out.println("Input Name.");
		student.setName(reader.nextLine());
		System.out.println("Input Grade.");
		student.setGrade(reader.nextInt());
		System.out.println("Input GPA.");
		student.setGpa(reader.nextDouble());
		System.out.println(student.getName());
		System.out.println(student.getGrade());
		System.out.println(student.getGpa());
		return student;
		
	}

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		Student[] students=new Student[10];
		Student student1=students[0]=inputAllInfo();
		Student student2=students[1]=inputAllInfo();
		/*Student student3=students[2]=inputAllInfo();
		Student student4=students[3]=inputAllInfo();
		Student student5=students[4]=inputAllInfo();
		Student student6=students[5]=inputAllInfo();
		Student student7=students[6]=inputAllInfo();
		Student student8=students[7]=inputAllInfo();
		Student student9=students[8]=inputAllInfo();
		Student student10=students[9]=inputAllInfo(); */
		
		student1.getInfo();
		student2.getInfo();
		
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
