package com.ConditionalOper;

import java.util.Scanner;

public class CheckThreeDigitNo {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter number :- ");
		int i = sc.nextInt();
		
		String s = (i >= 100 && i <= 999 ? i+ " number is  three digit " : i+" number is not three digit");
		System.out.println(s);
	sc.close();
	}
	

}
