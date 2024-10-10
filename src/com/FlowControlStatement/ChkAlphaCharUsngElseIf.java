package com.FlowControlStatement;

import java.util.Scanner;

public class ChkAlphaCharUsngElseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character :- ");
		char ch = sc.next().charAt(0);
		
		if((ch >= 'a') && (ch <= 'z')) {
			System.out.println(ch+ " character is in lowercase");
		} else if((ch >= 'A') && (ch <= 'Z')) {
			System.out.println(ch+ " Character us in uppercase ");
		} else {
			System.out.println(ch+" not a character");
		}
	}

}

