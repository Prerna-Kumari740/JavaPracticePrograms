package com.Loop;

import java.util.Scanner;

public class CheckDivision {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("--------program start-------");
	System.out.println("Enter no :- ");
	int i = sc.nextInt();
	
	while(i<= 100) {
		if(i % 7==0) {
	System.out.println(" not divisible by 7 ");
	
	
			
			}
			System.out.println(i + " divisible by 7.");
		}
	}
}
