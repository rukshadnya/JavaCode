package com.array;


//Program to print the largest element in an array
 
public class LargestElementInArray {

	public static void main(String[] args) {
		
		
		 int [] arr = new int [] {10,20,54,63,78,98};  
		 
	        //Initialize max with first element of array
		 
	        int max = arr[0];  
	        
	      
	        for (int i = 0; i < arr.length; i++) 
	        {  
	            
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("Largest element in array is: " + max);  
	}

}
