package org.perscholas.files;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//forgot to create file

public class Files_1 {

	public static void main(String[] args) {
	String location="C:\\Users\\Students\\eclipse-workspace\\PerScholas\\src\\org\\perscholas\\files\\hello";
		File file=new File(location);
			try {
			
				FileWriter writer = new FileWriter(file, true);
				writer.write("Hello\n");	
				writer.write("World\n");
				writer.write("I am bored\n");
				writer.write("I am Canadian\n");
				writer.close();
			} catch (IOException e1) {
				System.out.println("Cannot find file.");
				e1.printStackTrace();
			}
				

	
		
		try {
		
		
			Scanner input = new Scanner(file);	
			ArrayList<String> data = new ArrayList<String>();
			int lineCount=0;
			
			while(input.hasNextLine()) {
				data.add(input.nextLine());
				lineCount++;
			}
			for(lineCount=data.size()-1; lineCount>-1; lineCount--) {
				System.out.println(data.get(lineCount));
				
			}
	
			
			} catch (IOException e) {
				System.out.println("Cannot find file.");
			e.printStackTrace();
		}
		
	
		
		
		

	}


}

