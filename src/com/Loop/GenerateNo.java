package com.Loop;

import java.util.Scanner;

public class GenerateNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------program start-------");
		System.out.println("Enter no :- ");
		int i = sc.nextInt();
		
		while(i>= 0 && i<=10) {
			System.out.println(i);
			i++ ; 
		}
		System.out.println("all no are printed");
	}

}
