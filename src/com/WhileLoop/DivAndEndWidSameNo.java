package com.WhileLoop;


public class DivAndEndWidSameNo {
	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		while(i<=1000) {
			if (i % 7 == 0 && i % 10 == 7) {
				System.out.println(i + " no is divisible by 7 and end with 7");	
				count++;
		}
			i++;
		}
		System.out.println("total no are "+ count);
	}
}
