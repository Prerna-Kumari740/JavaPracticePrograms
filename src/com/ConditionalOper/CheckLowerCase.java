package com.ConditionalOper;

import java.util.Scanner;

public class CheckLowerCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char :- ");
		char inputChar = sc.next().charAt(0);
		
		String s = ( inputChar >='a' && inputChar <= 'z' ? inputChar+" is lowercase " :inputChar+" is  not lowercase ");
		
		System.out.println(s);
		sc.close();
	}

}
