package com.WhileLoop;

// sum of 1/1^2+1/2^2+1/3^2+........+1/100^2

public class Program4 {
	public static void main(String[] args) {
	
		// variable storing sum
		double sum = 0;
		
		// variable starting from 1
		int i = 1;
		
		//iteration upto 100
		while(i < 100) {
			
			//add current term to the condition
			sum += 1.0/i*1.0/i;
			i++;	
		}
		System.out.println(" print the sum series "+sum);
	}
}
