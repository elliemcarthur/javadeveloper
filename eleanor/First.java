package com.eleanor;
import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		
		System.out.println("1. Say Hello");
		System.out.println("2. Say my name");
		System.out.println("3. Exit");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if(answer == 1) {
			System.out.println("Hello There!");
		}
		else if(answer == 2) {
			System.out.println("What's your name");
			input.nextLine();
			String name = input.nextLine();
			System.out.println("Hello " + name + "!");
		}
		else {
			System.out.println("Gotcha.");
		}
		System.out.println("Exiting Program. Goodbye.");
		input.close();
	}
}
