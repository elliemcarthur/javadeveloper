package com.eleanor;

import java.io.InputStream;
import java.util.Scanner;

public class iforswitch {
	

	public static void main(String[] args) {
		InputStream bored;
		
		bored=System.in;
		Scanner reader = new Scanner(bored);
		System.out.println("Pick a number between 1-7");
		if (reader.nextInt()<=7) {
			System.out.println("Wednesday");
		}else{
			System.out.println("Pick another number");

	}
		reader.close();
	}}
	
