package com.FlowControlStatement;

import java.util.Scanner;

public class ChkRealRootQudrtcByIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a :- ");
		double a = sc.nextDouble();
		
		System.out.println("Enter the value of b :- ");
		double b = sc.nextDouble();
		
		
		System.out.println("Enter the value of c :- ");
		double c = sc.nextDouble();
		
		// calculate discriminant to determine the nature of the root
		double discriminant = b*b-4*a*c;
		
		// check the discriminant 
		if( discriminant  > 0) {
			
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			
			double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
			
			System.out.println("Root 1:" + root1);
			
			System.out.println("Root 2:" + root2);
			
		} else if(discriminant  == 0) {
			double root = -b / (2 * a);
			System.out.println("the equation has one real root and repeated root");
			
			System.out.println(" Root : " +root);
		} else {
			System.out.println("the equation has no real root. ");
			sc.close();
		}
		
		
		
	}

}
