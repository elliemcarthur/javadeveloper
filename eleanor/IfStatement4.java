package com.eleanor;

import java.util.Scanner;



public class IfStatement4 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
	System.out.println("Hey, what's your name?");
	String name=reader.nextLine();
	System.out.println("Ok, "+name+", how old are you?");
	int age=reader.nextInt();
	if (age<16) {
		System.out.println("You can't drive");

	}else if(age<18) {
		System.out.println("You can't vote");

	}else if(age<25) {
		System.out.println("You can't rent a car");
	}else {
		System.out.println("You can do anything that's legal.");
	}
	
	}

}
