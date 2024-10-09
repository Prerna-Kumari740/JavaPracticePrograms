package com.TypeOfVariables;

public class Test {
	static int a = 30;
	static int b = 63;
	public static void main(String[] args) {
		System.out.println(a);  //local variable will be called
		System.out.println(Test.a); // global variable will be called 
	}

}
