package com.eleanor;


public class PrefixVsPostfix {
	public static void main(String[] args) {
		int i = 0;
		
		//Postfix
		System.out.println(i++ + i);
		
		//Reset value of i
		i = 0;
		
		//Prefix
		System.out.println(++i + i);
		
		i = 0;
						 //0   -  -2
		System.out.println(i-- - --i);
		
	}
}
