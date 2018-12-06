package com.aboieriu;

/**
 * @author aboieriu
 */
public class IfStatementMain {

	public static void main(String[] args) {

		int myVar = 0;

		if (myVar < 3 && myVar > 1) {
			// Insert code for true condition
			System.out.println("code for true condition");
		} else if (myVar == 0) {
			// Insert code for false condition
			System.out.println("my var is 0");
		} else {
			System.out.println("code for false condition");
		}
	}
}
