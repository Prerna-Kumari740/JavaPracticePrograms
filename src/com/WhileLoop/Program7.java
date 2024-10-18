package com.WhileLoop;

import java.util.Scanner;

//take a user input print and count all the factor of a given no (no itself is not included  )

public class Program7 {
	public static void main(String[] args) {
		
		// create a scanner object  to take  input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter number :- ");//ask the user to entered number
		
		int n = sc.nextInt();// read the input entered by the user
		
		int sum = 0; // initialize a counter to count the factor variable 
		
		int i = 1;// initialize a counter  variable to 1
		
		while(i <= n/2) { // while loop to find the factor of the number
			if(n % i == 0) { // check if i is a factor of a number
				System.out.println(i+" "); // print the factor
				sum++; // increment the factor count
			}
			i++; // increment i to check the next potential factor
		}
		System.out.println( " total count is : "+sum); // print the total count of factor
	}

}
