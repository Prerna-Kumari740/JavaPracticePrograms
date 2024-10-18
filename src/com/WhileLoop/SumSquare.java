package com.WhileLoop;

public class SumSquare {
	public static void main(String[] args) {
		
		//variable to store sum of square
		int sum = 0;
		
		//count variable to starting from 1
		int i =1;
		 
		// loop for iteration from 1 to 100
		while(i <= 3) {
			
			// ad square of the current number to the sum
			sum = sum+i*i; 
			i++;
		}
		System.out.println("the sum of square of all the number from 1 to 100 is : " +sum);
	}

}
