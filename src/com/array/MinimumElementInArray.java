package com.array;

public class MinimumElementInArray {

	public static void main(String[] args) {
		
		int [] arr = new int [] {2,32,54,33,10,45};
		
		int min = arr[0];

		for (int i = 0; i<arr.length; i++)
		{
			if (arr[i] < min)
				
				min = arr[i];
		}

		System.out.println("smallest element in array " + min);
	}

}
