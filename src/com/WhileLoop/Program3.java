package com.WhileLoop;

// sum of 1/1+1/2+1/3+........+1/100

public class Program3 {
	public static void main(String[] args) {
		
		// variable store sum
		double sum = 0;
		
		// variable starting from 1
		int i = 1;
		
		// iteration upto 100
		while(i < 3) {
			
			// add the current term to the sum
			 sum+=1.0/i;
			i++;
		}
		System.out.println("Print the sum of the series "+sum);
	}
}
