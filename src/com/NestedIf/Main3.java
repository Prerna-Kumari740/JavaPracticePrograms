package com.NestedIf;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks:- ");
		int m = sc.nextInt();

		if (m >= 70) {
			if ((m > 90) && (m < 100)) {
				System.out.println(" grade A.");
			} else if ((m > 80) && (m < 90)) {
				System.out.println(" grade b.");
			} else {
				System.out.println(" grade c.");
			}
		} else if ((m > 40) && (m < 70)) {
			System.out.println(" Average. ");
		} else {
			System.out.println(" fail.");
		}

	}
}
