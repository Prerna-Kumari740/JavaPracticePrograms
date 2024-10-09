package com.FlowControlStatement;

import java.util.Scanner;

public class SpecialChUsngIf {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter input :- ");
		char ch = sc.next().charAt(0);
		
		
		
		if(ch >= 'a' && ch <= 'z' || ch>= 'A' &&  ch <='Z') {
			System.out.println(ch + " is Character");
	
		}else  if(ch >= '0' && ch<='9'){
			System.out.println(ch + " is a digit  ");
		}else {
			System.out.println(ch+ " is a special char");
		}
		sc.close();
		
	}

}
