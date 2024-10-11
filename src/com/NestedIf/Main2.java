package com.NestedIf;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter age :- ");
		int age  =  sc.nextInt();
			
		
			
		if(age > 30 ) {
			System.out.println(" enter income :- ");
			double  income =  sc.nextDouble();
			if( income > 50000) {
				System.out.println(" person   is eligible for loan. ");
			} else {
				System.out.println( " person  it is not eligible for loan");
			}
		}else {
			System.out.println( " person is not eligible for loan");
		}
	}

}
