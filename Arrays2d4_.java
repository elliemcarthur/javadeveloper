package org.perscholas.lms.homework4;
import java.util.Scanner;

public class Arrays2d4_ {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		String[][] plane= new String[5][5];
		int pickrow=0;
		int pickcol=0;
		int counter=0;
	
		for(int row=0; row<plane.length; row++) {
    			
    			for(int col=0; col< plane[row].length; col++) {
    				plane[row][col]="O";
    			
    			}
    	
    		   }
		String firstpoint=plane[pickrow][pickcol]="X";
		for(int r=0; r<plane.length; r++) {
			
			for(int c=0; c< plane[r].length; c++) {
				System.out.print(plane[r][c]);
			
			}	
			System.out.println(" ");
       }
		int directionpick;
	

do {	System.out.println("What direction would you like to go?\n");
System.out.println("1=Down : 2=Up : 3=Right : 4=Left");

directionpick=reader.nextInt();

firstpoint= plane[pickrow][pickcol]="O";
counter++;
if (directionpick==1 && pickrow!=4) {
	pickrow++;
		firstpoint=plane[pickrow][pickcol];
	 	firstpoint=plane[pickrow][pickcol]="X";
		      {for(int i=0; i<plane.length; i++) {
						
						 for(int j=0; j< plane[i].length; j++) {
				        System.out.print(plane[i][j]);
				       

	                                                          }	
					System.out.println(" ");
				
		        }}
		     
			
} 

else if(directionpick==2 && pickrow!=0 ){
	pickrow=pickrow-1;
	firstpoint=plane[pickrow][pickcol];
 	firstpoint=plane[pickrow][pickcol]="X";
	        for(int i=0; i<plane.length; i++) {
					 					 
	        	for(int j=0; j< plane[i].length; j++) {
			        System.out.print(plane[i][j]);

                                                          }	
				System.out.println(" ");
		
}	

		}
else if(directionpick==3 && pickcol != 4) {
				pickcol=pickcol+1;
			firstpoint=plane[pickrow][pickcol];
		 	firstpoint=plane[pickrow][pickcol]="X";
	        for(int i=0; i<plane.length; i++) {
					 
					 for(int j=0; j< plane[i].length; j++) {
			        System.out.print(plane[i][j]);

                                                          }	
				System.out.println(" ");
		
}	
	
	}	else if(directionpick==4 && pickcol!=0) {
		pickcol=pickcol-1;
		firstpoint=plane[pickrow][pickcol];
	 	firstpoint=plane[pickrow][pickcol]="X";
        for(int i=0; i<plane.length; i++) {
				 
				 for(int j=0; j< plane[i].length; j++) {
		        System.out.print(plane[i][j]);

                                                      }	
			System.out.println(" ");
	
}	
		
	}
		else {
		System.out.println("NULL!  PICK ANOTHER NUMBER");
	}
	}
	while(counter>0);
	
System.out.println(" ");	
}}

	





