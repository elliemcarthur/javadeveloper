package org.perscholas.files;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Files5 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		Student[] students=new Student[10];
		for (int n=0; n<students.length; n++) {
	    students[n]=new Student();
		}
		String slocation="C:\\Users\\Robyn\\eclipse-workspace\\PerScholas\\src\\org\\perscholas\\files\\students.csv";
		
		File studentfile=new File(slocation);
	
		
		FileWriter	writer = new FileWriter(studentfile, true);
		for(int m=0; m<students.length; m++) {
		writer.write(students[m].getName() + ",");
		}
		for(int k=0; k< students.length; k++) {
		writer.write(students[k].getGrade() + ",");
		}
					
		for(int p=0; p<students.length; p++) {
		writer.write(String.valueOf(students[p].getGpa()) + "\n");
		}
		//read file
		Scanner input= new Scanner(studentfile);
		String lines[];
		while(input.hasNextLine()) {
			lines +=lines+ input.nextLine().split(",");
		}

	}

}
