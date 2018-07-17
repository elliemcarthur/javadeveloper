package com.eleanor;

public class IfStatement3 {

	public static void main(String[] args) {
		int people=0;
		int cars=1;
		int buses=1;
		
		if(cars>people) {
			System.out.println("We should take the cars.");
		}else if(cars<people) {
			System.out.println("We should not take the cars");
		}else {
			System.out.println("We can't decide.");
		}
		
		if(buses>cars) {
			System.out.println("That's too many buses.");
		} else if(buses<cars) {
			System.out.println("Maybe we should take the buses.");
		}else {
			System.out.println("We still can't decide.");
		}
		
		if(people>buses) {
			System.out.println("Alright, let's just take the buses.");
		}{
			System.out.println("Let's just take the cars.");
		}
	}

}
/* I believe if makes the code test against the boolean that is in brackets to see if it is true,
if it is not true, then the code knows to go to the else and continue the code;  However, if there is
another if, then it'll test against what is beside the other if again */
