package com.LogicalOper;

// / logical operator are used to take boolean operands and gives boolean value 
public class AndOperator {
	public static void main(String[] args) {
		//take two boolean operands if both are true then it will  gives true 
		// && it skips second operands  if 1st  operand is false
		// & it check both operands in any case
		
		int x  =15;
		int y = 20;
		System.out.println(x++> 10 && y++> 15);
		System.out.println(x++> 15 & y++> 45);
	}

}
