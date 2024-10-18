package com.WhileLoop;

public class SumCube {
	public static void main(String[] args) {
		
		// variable to store the sum of square
		int sum = 0;
		
		// count variable starting from 1
		int i = 1;
		
		// loop for iteration from 1 to 100
		while(i <= 2) {
			sum = sum+i*i*i;
			i++;
		}
		System.out.println("the sum of cube of all the number from 1 to 100 is : " + sum);
	}

}
