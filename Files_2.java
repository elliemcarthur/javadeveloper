package org.perscholas.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Files_2 {

	public static void main(String[] args) {
	//String location="C:\\Users\\Students\\eclipse-workspace\\PerScholas\\src\\org\\perscholas\\files\\courseCode";
	//String location2="C:\\Users\\Students\\eclipse-workspace\\PerScholas\\src\\org\\perscholas\\files\\courseName";
		
		String location="C:\\Users\\Robyn\\eclipse-workspace\\PerScholas\\src\\org\\perscholas\\files\\courseCode";
		String location2="C:\\Users\\Robyn\\eclipse-workspace\\PerScholas\\src\\org\\perscholas\\files\\courseName";
	
	File file=new File(location);
	File file2=new File(location2);
	
	try {
	FileWriter	writer = new FileWriter(file, true);
		writer.write("CS235\n");
	    writer.write("CS135\n");
	    writer.close();
	
	} catch (IOException e) {
		System.out.println("Cannot find file.");
		e.printStackTrace();
	}
	
	FileWriter writer2;
	try {
		writer2 = new FileWriter(file2, true);
		writer2.write("Object Oriented Programming II \n");
		writer2.write("Intro to Object Oriented Programming");	
		writer2.close();
		Scanner	input1 = new Scanner(file);
	ArrayList<String> courseCodes = new ArrayList<String>();	
	while(input1.hasNextLine()) {
		courseCodes.add(input1.nextLine());
	}
	
	Scanner input2= new Scanner(file);
	ArrayList<String> courseNames = new ArrayList<String>();
		input2 = new Scanner(file2);
		while(input2.hasNextLine()) {
		courseNames.add(input2.nextLine());
		}
		for(int n=0; n<courseCodes.size(); n++) {
			System.out.println(courseCodes.get(n) + " - " +courseNames.get(n));
			}
		input1.close();
		input2.close();
		
		
	}
	

	 catch (IOException e) {
		System.out.println("Cannot find file.");
		e.printStackTrace();
	}
	 

	
	
	}

}
