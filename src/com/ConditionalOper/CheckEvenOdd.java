package com.ConditionalOper;

import java.util.Scanner;

public class CheckEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :- ");
		int num = sc.nextInt();
		
		
		String result   =(num % 2 == 0) ? "Even" : "Odd";
		
		System.out.println("The number is " + result );
		sc.close();
	}
}
