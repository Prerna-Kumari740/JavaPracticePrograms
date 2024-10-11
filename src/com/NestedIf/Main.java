package com.NestedIf;

import java.util.Scanner;

// take a user input if it is a  3 digit no then check weather it is divisible by 12 or not otherwise if it is not  3 digit  no then check  and print weather it is divide by 5 or not.

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter no :-");
		int num = sc.nextInt();
		
		if((num >= 100 ) && (num <= 999)) {
			if(num % 12 == 0) {
				 System.out.println(num + " is  3 digit no and divisible by 12. ");
			}else {
				System.out.println(num + " is 3 digit no is and not divisible by 12. ");
			}
		} else {
			if(num % 5 == 0) {
				System.out.println(num + " it is not  3 digit no and it is divisible by 5");
			}else {
				System.out.println(num + " it is not  3 digit no and it is not divisible by 5");
			}
		}
		
	}
	}
