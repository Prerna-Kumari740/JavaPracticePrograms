package com.WhileLoop;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		// user input for no 
		System.out.println("Enter number  :- ");
		int a = sc.nextInt();
		
		// user input for power
		System.out.println("Enter power  :- ");
		int b = sc.nextInt();
		// variable storing power 
		int power = 1;
		
		// variable starting from 1
		int i = 1;
		
		// Iteration up to b
		while(i <= b) {
			
			//power of the number 
			power = power*a;
			i++;
		}
		System.out.println(" power is " + power);
		sc.close();
	}

}
