package com.WhileLoop;

public class ChckDiv {
	public static void main(String[] args) {
		System.out.println("----Start Program-----");
		int i = 0;
		while (i <= 100) {
			if (i % 12 == 0) {
				System.out.println(i+ " is divisible by 12");
			}
			i++;
		}
	}

}
