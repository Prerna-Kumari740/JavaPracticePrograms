package com.ConditionalOper;

import java.util.Scanner;

public class CheckTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of side 1 : ");
		double side1 = sc.nextDouble();
		
		System.out.println("Enter the length of side 2 : ");
		double side2 = sc.nextDouble();
		
		System.out.println("Enter the length of side 3 : ");
		double side3 = sc.nextDouble();
		
		String s = (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1 ? "triangle is valid" :" triangle is not valid");
		
		System.out.println(s);
		sc.close();
		
		
	}

}
