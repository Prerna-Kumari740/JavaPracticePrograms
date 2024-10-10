package com.FlowControlStatement;

import java.util.Scanner;

public class ChkNoIsPstvNgtvUsngElseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :- ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println(num + " no is positive ");
				}else if(num<0) {
					System.out.println(num+" no is negative");
				}else {
					System.out.println(num+ " this  no is zero");
					sc.close();
				}
	
	}

}
