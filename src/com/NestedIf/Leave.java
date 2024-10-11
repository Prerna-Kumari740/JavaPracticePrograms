package com.NestedIf;

import java.util.Scanner;

public class Leave {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sal. ");
		int sal = sc.nextInt();	
		
		System.out.println("Enter festival name. ");
		String festival = sc.next();
		if ((festival.equals("diwali")) || (festival.equals("chath"))) {
			
			System.out.println("Enter employee location. ");
			String location = sc.next();
			if (location.equals("bihar")) {
				System.out.println("eligible for leave ");
			}
			
			else if (sal >= 20000){
				System.out.println("he got bonus");
			}else {
				System.out.println("salary less than 20000");
			}
		}
		else {
			System.out.println("not other reason require for leave");
		}
	}

}
