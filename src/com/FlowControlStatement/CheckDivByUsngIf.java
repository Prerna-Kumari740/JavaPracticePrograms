package com.FlowControlStatement;

import java.util.Scanner;

public class CheckDivByUsngIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number :- ");
		int i = sc.nextInt();
		
		if(i % 5 == 0 && i % 11 == 0) {
			System.out.println(i+" divisible by 5 and 11");
		} else {
			System.out.println(i+" not divisible by 5 and 11");
			sc.close();
		}
	}

}
