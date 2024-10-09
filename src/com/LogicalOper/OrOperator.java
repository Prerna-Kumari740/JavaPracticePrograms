package com.LogicalOper;

public class OrOperator {
	public static void main(String[] args) {
		// it give true if atleast one operand is true
		// || it skip 2nd operand if 1st is true
		// | it check both operands  in any case
		
		int x = 10;
		int y = 12;
		System.out.println(10>8 || 12>13);
		System.out.println(2>8 || 12>13);
		System.out.println(10>1 | 12>13);
		System.out.println(10>16 | 12>13);
	}

}
