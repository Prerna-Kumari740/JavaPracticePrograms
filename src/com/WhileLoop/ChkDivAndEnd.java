package com.WhileLoop;

public class ChkDivAndEnd {
	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		while (i <= 1000) {
			if (i % 12 == 0 && i % 10 == 8) {
				System.out.println(i + " is divisible by 12 and end with 8");
				count++;
			}
			i++;
		}
		System.out.println("total no are " + count);
	}

}
