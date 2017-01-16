
/*
 * Getting sum of two numbers
 *
 *   Malla, Isha<br>
 *   Created: Jan 16, 2017
 *
 */

package com.sqa.im;

import java.util.*;

import com.sqa.im.helpers.*;

public class AddingNumbersApp {

	public static void addTwoNumbers() {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, total;
		System.out.print("What is the first number to be added?: ");
		num1 = scanner.nextInt();
		System.out.print("What is the second number to be added?: ");
		num2 = scanner.nextInt();
		total = num1 + num2;
		System.out.print("The sum of the two numbers you entered is: " + total + ". ");
	}

	public static void main(String[] args) {
		String appName = "Adding Numbers";
		String userName = AppBasics.greetUserAndGetName(appName);
		addTwoNumbers();
		AppBasics.farewellUser(userName, appName);
	}
}
