package com.starPattern;

public class RightAngleStarPatternProgram1 {

public static void main(String[] args) {
		
	    for (int i = 1; i <= 5; i++)
        {
            
             
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
  
             
            System.out.println();
        }
  
	    System.out.println("----------------");
	    
	    for (int n = 1; n <= 5; n++)
        {
            
             
            for (int m = 5; m >= n; m--)
            {
                System.out.print("* ");
            }
  
             
            System.out.println();
        }
  
	    
	   
	}
}
