package com.ConditionalOper;

import java.util.Scanner;

public class CheckAlphabet {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a  character :- ");
		char inputchar = sc.next().charAt(0);
		
		String s = (inputchar >= 'a' && inputchar <= 'z' ||inputchar >= 'A' && inputchar <= 'Z' ? inputchar +" is an alphabet " :inputchar +" is an not  alphabet ");
		System.out.println(s);
		sc.close();
	}
}
