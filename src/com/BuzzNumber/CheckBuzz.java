package com.BuzzNumber;

import java.util.Scanner;

public class CheckBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :- ");
		int num = sc.nextInt();
		
		
		if(num % 7==0 || num  % 100 ==7 ) {
			System.out.println(" Given Number Is Buzz "+num);
			if( num  % 10 ==7 ) {
				System.out.println("Given no last digit is 7:");
			}
			
		} else {
			System.out.println("Given Number Is Not Buzz");
		}
	}

}
