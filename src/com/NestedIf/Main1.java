package com.NestedIf;

// check +ve -ve 0  find even or odd if no +ve   
import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println( " Enter no :- ");
		int n = sc.nextInt();
		
		
		
		if(n > 0 ) {
			
			if(n % 2 == 0) {
				System.out.println(n + " is positive and  even");
			}else {
				System.out.println(n + " is odd");
			}
				
		} else if(n < 0) {
			 System.out.println(n + " is negative ");
		}else {
			System.out.println(n + "  Zero ");
		}
	}

}
