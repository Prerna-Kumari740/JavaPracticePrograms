package com.FlowControlStatement;

import java.util.Scanner;

public class LeapYearUsngIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a number :- ");
		int i = sc.nextInt();

		if (i % 400 == 0 || i % 4 == 0) {
			System.out.println(i + " leapyear ");
		} else {
			System.out.println(i + " not a leap year");
			
			sc.close();
		}
	}

}
