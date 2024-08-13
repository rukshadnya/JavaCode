package com.array;


//Program to print the elements of an array in reverse order

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10,9,8,7,6,5,4};
		
		System.out.println("Original Array");
		
		for (int i = 0; i< arr.length; i++)
		{
			System.out.print(arr[i]);
		}

		System.out.println();
		
		System.out.println("reverse array");
		
		for (int i = arr.length-1; i>= 0; i--)
		{
			System.out.print(arr[i]);
		}
	}

}
