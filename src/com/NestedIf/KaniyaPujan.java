package com.NestedIf;

import java.util.Scanner;

public class KaniyaPujan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter age :- ");
		int age = sc.nextInt();
		
		System.out.println(" Enter gender :- ");
		char  gender = sc.next().charAt(0);

		
		if((age >= 0) &&  (age <= 12)) {
			if(gender == 'f') {
				System.out.println( "kaniya");
			}else {
				System.out.println("batuk");
			}
		}else {
			System.out.println("not count in kaniya");
		}
	}
}
