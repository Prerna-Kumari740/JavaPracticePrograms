package com.ConditionalOper;

import java.util.Scanner;

public class CheckDay {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day");
		String day = sc.next();
		
		String s  = (day.equals("saturday") || day.equals( "sunday")? "weekend" : "weekday") ;
		System.out.println(s);
		sc.close();
	}
}
