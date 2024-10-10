package com.FlowControlStatement;

import java.util.Scanner;

public class DivByElseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number :- ");
		int num = sc.nextInt();
		
		if(num % 4 == 0) {
			System.out.println(num+" is divisible by 4 and 8.");
		} else if(num % 8 ==0) {
			System.out.println(num + " is divisible by 4 and 8.");
		} else {
			System.out.println(num + " is not divisible by 4 and 8.");
		}
	}

}
