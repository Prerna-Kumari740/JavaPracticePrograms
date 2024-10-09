package com.ConditionalOper;

import java.util.Scanner;

public class CheckDivNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		
		String s = (num % 5 ==0  || num % 11 == 0 ? num + " is divisible " : num+ " is not divisible");
		System.out.println(s);
		sc.close();
	}

}
