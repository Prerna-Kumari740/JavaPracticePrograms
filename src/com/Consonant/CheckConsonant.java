package com.Consonant;

import java.util.Scanner;

public class CheckConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char :-");
		char ch = sc.next().charAt(0);
		
		if(ch != 'a'&& ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
			System.out.println(ch+ " is Consonant ");
		}else {
			System.out.println(ch +" is vowel");
		}
		
	}

}
//  toUpperCase