package com.LogicalOper;

public class NotOperator {
	public static void main(String[] args) {
		//it will reverse it boolean state
		
		int x = 12;
		int y = 20;
		System.out.println(!((x+y)>50));
		System.out.println(!(x++ >10 && y++>5));
	}

}
