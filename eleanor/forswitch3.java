package com.eleanor;

import java.io.InputStream;
import java.util.Scanner;

public class forswitch3 {

	private static InputStream typing;

	public static void main(String[] args) {
	typing=System.in;
	Scanner reader=new Scanner(typing);
	System.out.println("Type number between 1-4 to pick a card suit");
	if (reader.nextLine().equals("1 \n")) {
		System.out.println("Hearts");
	}else if (reader.nextLine().equals("2 \n")) {
		System.out.println("Clubs");
	}
	else if (reader.nextLine().equals("3 \n")) {
		System.out.println("Spades");
	}else if(reader.nextLine().equals("4 \n")){
		System.out.println("Diamonds");
	}else {
		System.out.println("You suck.  Read the instructions.");
	}
	reader.close();
	}

}
