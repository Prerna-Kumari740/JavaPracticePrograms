package com.WhileLoop;

//sum of1*2+2*3+3*4+.........+99*100

public class Prg {
	public static void main(String[] args){
		
		// variable to the store sum
		int  sum = 0;
		
		//count variable starting from 1
		int i = 1;
		
		//loop for iteration upto 100
		while(i <= 3) {
			sum =sum+i*(i+1); 
			i++;
		}
		System.out.println("the sum of the series "+sum);
		
	}

}
