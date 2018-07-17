package com.eleanor;

import java.io.InputStream;
import java.util.Scanner;

public class fororswitch2  {

public static void main(String[] args) {
	
	InputStream typing;
	typing=System.in;
Scanner reader= new Scanner(typing);

System.out.println("Type in a day of the week.");
if(reader.next().equals("Sunday")) {
	System.out.println("1");
}else if(reader.next().equals("Monday")){
	System.out.println(2);
	
}else if(reader.next().equals("Tuesday")) {
	System.out.println(3);
}else {
	System.out.println("this sucks");
}reader.close();

}

}
