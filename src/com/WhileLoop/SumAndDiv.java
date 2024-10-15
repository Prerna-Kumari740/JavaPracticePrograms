package com.WhileLoop;

public class SumAndDiv {
	public static void main(String[] args) {
		
		// variable to store the sum
		int sum = 0;
		
		//counter variable to starting from 1
		int i = 1;
		
		// loop to iterate from 1 to 100
		while(i <= 1000) {
			
			// check division by 6
			if(i % 6 == 0) {
				System.out.println(i+ " is divisible by 6");
			}
			// add current number to sum 
			sum = sum+i;
			
			// increment the counter
			i++;
		}
		System.out.println("total no of sum "+sum);
	}

}
