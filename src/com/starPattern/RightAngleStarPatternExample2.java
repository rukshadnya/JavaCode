package com.starPattern;

public class RightAngleStarPatternExample2 {


	public static void main(String[] args) {
		
		 for (int i = 1; i <= 5; i++)
	        {
	            
	             
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print("* ");
	            }
	  
	             
	            System.out.println();
	        }
	  
		  
		    
		    for (int n = 1; n <= 5; n++)
	        {
	            
	             
	            for (int m = 4; m >= n; m--)
	            {
	                System.out.print("* ");
	            }
	  
	             
	            System.out.println();
	        }
	  
		    
	}
}

