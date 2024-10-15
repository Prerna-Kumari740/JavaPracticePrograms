package com.WhileLoop;

// in each iteration current no i is added to the sum.

public class Sum {
	public static void main(String[] args) {
		
		//variable to store the sum
		int sum = 0;
		
		//counter variable starting from 1
		int i = 1;
		
		//loop to iterate from 1 to 1000
		while(i <= 1000) {
			
			//add current number to sum
			sum = sum+i;
			
			//increment the counter
			i++;
			
		}
		// print the total sum  of all number 1 t0 1000
		System.out.println(" total no of sum is "+sum);
	}

}
