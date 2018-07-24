package org.perscholas.files;

import java.util.Scanner;

public class Files_3 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		Student student1=new Student();
		student1.setName(reader.nextLine());
		student1.setGrade(reader.nextLine().charAt(0));
		student1.setGpa(reader.nextDouble());

	}

}
