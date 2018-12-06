package com.aboieriu;

/**
 * @author aboieriu
 */
public class SumAllNumbers {

	public static void main(String[] args) {
		int myTargetVariable = 5;

		int result = 0;
		for (int index = 0; index <=myTargetVariable; index ++) {
			result = result + index;
		}


		System.out.println("Sum is " + result);


		System.out.println("Second approach: Sum is " + sumNumvers(10));
	}

	private static int sumNumvers(int targetVariable) {
		int result = 0;
		for (int index = 0; index <=targetVariable; index ++) {
			result = result + index;
		}

		return result;
	}
}
