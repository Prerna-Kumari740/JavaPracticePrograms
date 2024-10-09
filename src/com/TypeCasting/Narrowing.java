package com.TypeCasting;

// when a large primitive data type convert into smaller primitive data type. in narrowing there will be 0 data loss 
public class Narrowing {
	public static void main(String[] args) {
		int x = 12;
		byte num = (byte)x;
		System.out.println("int value" +x);
		System.out.println("byte value"+num);
	}

}
