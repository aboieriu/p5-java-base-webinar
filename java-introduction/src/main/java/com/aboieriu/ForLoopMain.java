package com.aboieriu;

/**
 * @author aboieriu
 */
public class ForLoopMain {

	public static void main(String[] args) {
		Rocket[] myRocketArray = new Rocket[3];

		myRocketArray[0] = new Rocket(100, 100, "RED");
		myRocketArray[1] = new Rocket(100, 100, "BLUE");
		myRocketArray[2] = new Rocket(100, 100, "GREY");

		for (int index = 0; index < myRocketArray.length; index++) {
			Rocket arrayElement = myRocketArray[index];
			System.out.println(arrayElement.getColor());
		}

		int intVar = 0;
		while (intVar < 5) {
			System.out.println("my var is still < 5");
			intVar++;
		}

		char myChar = 'a';

		String myString = "HelloWorld";

		char[] myStringAsCharArray = myString.toCharArray();

		for (int index = 0; index < myStringAsCharArray.length; index++) {
			System.out.println("current char: " + myStringAsCharArray[index]);
		}

	}
}
