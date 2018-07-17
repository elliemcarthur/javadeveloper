package com.eleanor;


public class IfStatement1 {

public static void main(String[] args) {
	int people = 0;
	int cats = 0;
	int dogs = 0;
	//the person who created this project hates cats and thinks a world of more cats than people is bad for the world
	if (people>cats) {
		System.out.println("Too many cats!  The world is doomed!");
		//this person likes people more than cats, because they feel the world is saved
			} else if (people<cats)  {
				System.out.println("Too few cats!  The world is saved for another day!");
				}
	//this person hates dog drool, the program will test to see if there are more people than dogs,
	//if there isn't , then the world will be drooled on; if there is, then the world will be dry and excuted by the else statement
		 if(people<dogs) {
					System.out.println("The world is drooled on!");
				}
			else if (people>dogs){
				System.out.println("The world is dry!");
			}
	}

}
