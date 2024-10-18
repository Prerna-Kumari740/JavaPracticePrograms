package com.WhileLoop;

//sum of 1*2^2+2*3^2+3*2^2+.........+99*100^2

public class Program2 {
	public static void main(String[] args) {
		System.out.println("-----Program Start----");
		
		//variable to the  store sum 
		int sum = 0;
		
		//count  variable starting from 1
		int i  = 1;
		
		//loop for iteration upto 100 
		while(i < 100) {
			sum = sum+i*(i+1)*(i+1);
			i++;
		}
		System.out.println(sum);
	}

}
