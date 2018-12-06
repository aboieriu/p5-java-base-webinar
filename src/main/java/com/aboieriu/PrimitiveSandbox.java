package com.aboieriu;

/**
 * Playing around with integers
 * @author aboieriu
 */
public class IntegerSandbox {
	public static void main(String[] args) {
		int intVarDefault;
		int intVarWithValue = 100;

		printBinaryStr(Integer.MAX_VALUE);
		printBinaryStr(Integer.MIN_VALUE);

	}

	private static void printBinaryStr(int targetNumber) {
		String binaryString = Integer.toBinaryString(targetNumber);
		System.out.println(binaryString + " - " + binaryString.length());
	}
}
