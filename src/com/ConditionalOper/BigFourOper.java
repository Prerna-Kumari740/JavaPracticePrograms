package com.ConditionalOper;

import java.util.Scanner;

public class BigFourOper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number :-");
		int n1 = sc.nextInt();
		
		System.out.println("Enter 2nd number :-");
		int n2 = sc.nextInt();
		
		System.out.println("Enter 3rd number :-");
		int n3 = sc.nextInt();
		
		System.out.println("Enter 4th number :-");
		int n4 = sc.nextInt();
		
	int n = (n1 > n2) ?
			((n1 > n3 )?
			((n1 > n4 ) ? n1 : n4) 
			: (n3 > n4 ? n3 : n4 ))
			:((n2 > n3)? 
					((n2 > n4 )? n2 : n4)
					: (n3 > n4 ? n3 : n4));
	
	System.out.println(n);
			sc.close();
				}

}
