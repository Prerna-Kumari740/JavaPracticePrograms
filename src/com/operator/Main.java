package com.operator;

import java.util.Scanner;

//take user input for the given number print the last digit of no ?
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter an integer: ");
		int x = sc.nextInt();
		// int x = 435;
		int  lastDigit = x % 10;  // to extract the last digit of the integer
					
		System.out.println("last digit is "+lastDigit);
	}

}
