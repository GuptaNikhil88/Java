package com.practice;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternValidation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		int count = 0;
		while (testCases > 0) {
			String pattern = in.nextLine();
			// Write your code
			// Pattern r = ;
			try {
				if (Pattern.compile(pattern).toString()
						.equalsIgnoreCase(pattern)) {
					System.out.println("Valid");

				}
			} catch (PatternSyntaxException p) {
				System.out.println("Invalid");
			}

			count++;
			if (count == testCases)
				break;
		}
	}
}
