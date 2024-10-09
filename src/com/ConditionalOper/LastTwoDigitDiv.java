package com.ConditionalOper;

import java.util.Scanner;

public class LastTwoDigitDiv {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :-");
		int i = sc.nextInt();
		
		int numDiv = i % 100;
		String s = (numDiv % 8 == 0   ? i+" last two digit is  divisible by 8 " : i+ "  last two digit is not divisible by 8");
				System.out.println(s);
				sc.close();
	}

}
