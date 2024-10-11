package com.NestedIf;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter - ");
		int year = sc.nextInt();
		
		if(year >= 2000 && year <= 3000) {
			if(year % 4 == 0 || year % 400 ==0) {
				System.out.println("leap year");
			} else  {
				System.out.println(" not a leap year");
			}
		} else {
			System.out.println(" year not between 2000 to 3000");
		}
	}

}
