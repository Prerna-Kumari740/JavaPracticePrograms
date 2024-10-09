package com.MathOpeartion;

import java.util.Scanner;

public class MathOperation {
	public static void main(String[] args) {
		
		//create a scanner object to take input
		Scanner sc = new Scanner(System.in);
		
		//input number
		System.out.println("Enter the first  number :- ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enetr the second number :-");
		double num2 = sc.nextDouble();
		
		//Menu for operation
		System.out.println("Choose an operation: ");
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		
		//take user choice
		
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		//Switch case to perform  the operation 
		
		switch(choice) {
		case 1:
			System.out.println("Result: "+(num1+num2));
			break;
		case 2:
			System.out.println("Result: "+(num1-num2));
			break;
		case 3:
			System.out.println("Result: "+(num1*num2));
			break;
		case 4:
			// check if the second number is not zero for division
			if(num2!=0) {
				System.out.println("Result: "+(num1/num2));
				}else {
					System.out.println("Error Division by zero is not allowed.");
				}
			break;
			default :
			System.out.println(" please choose a valid operation");
		}
	}
}
