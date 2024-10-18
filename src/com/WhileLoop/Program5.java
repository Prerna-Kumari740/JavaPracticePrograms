package com.WhileLoop;

// take a no from user and print factorial 
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :- ");
		int num = sc.nextInt();
		
		// variable store factorial
		int fact = 1;
		
		// Variable starting from 1
		int i = 1;		
		
		// iteration start from 1
		while(i <= num) {
			
			//  multiply current term of condition
			fact = fact*i;
			
			i++;
		}
		System.out.println("factorial of "+num +" :-  " +fact);
		sc.close();
	}

}
