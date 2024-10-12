package com.Loop;

import java.util.Scanner;

public class InfiniteLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------program start-------");
		System.out.println("Enter no :- ");
		int i = sc.nextInt();
		
		while(i>= 0) {
			System.out.println(i);
			i++;
		}
	}

}
