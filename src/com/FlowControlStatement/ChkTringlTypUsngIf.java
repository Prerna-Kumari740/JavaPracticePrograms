package com.FlowControlStatement;

import java.util.Scanner;

public class ChkTringlTypUsngIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side 1 :- ");
		double side1 = sc.nextDouble();
		
		System.out.println("Enter side 2 :- ");
		double side2 = sc.nextDouble();
		
		System.out.println("Enter side 3 :- ");
		double side3 = sc.nextDouble();
			
			if((side1 == side2) && (side2 == side3)) {
				System.out.println(" the triangle is equilateral");
			}else  if((side1 == side2) || (side2 == side3) || (side1 == side3) ) {
				System.out.println(" the triangle is isosceles ");
			}else {
			System.out.println(" the triangle is scalene ");
			sc.close();
			}
		
		
	}

}
