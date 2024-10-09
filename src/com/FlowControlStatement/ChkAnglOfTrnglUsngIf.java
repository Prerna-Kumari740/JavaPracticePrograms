package com.FlowControlStatement;

import java.util.Scanner;

public class ChkAnglOfTrnglUsngIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Angle1 :- ");
		int angle1 = sc.nextInt();
		
		System.out.println("Enter Angle2 :- ");
		int angle2 = sc.nextInt();
		
		System.out.println("Enter Angle3 :- ");
		int angle3 = sc.nextInt();
		
		if(angle1+angle2+angle3==180 && angle1 >0 && angle2 >0 && angle3 >0 ) {
			System.out.println(" triangle is valid");	
		}else {
			System.out.println(" triangle is not valid");
			sc.close();
		}
	}

}
