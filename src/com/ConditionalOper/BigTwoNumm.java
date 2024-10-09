package com.ConditionalOper;

import java.util.Scanner;

// wajp to find biggest of three numbers by using conditional operator
public class BigTwoNumm {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 1st Number :- ");
	int num1 = sc.nextInt();
	
	System.out.println("Enter 2nd Number :- ");
	int num2 = sc.nextInt();
	
	System.out.println("Enter 3rd Number :- ");
	int num3 = sc.nextInt();
	
	
//	String s =(num1>num2?(num1>num3? num1+" bigger num  ":num3+"  bigger num "):num2+"bigger num");
	int s = (num1>num2?(num1>num3?num1:num3):num2>num3?num2:num3);
	System.out.println(s);
	sc.close();
}
}
