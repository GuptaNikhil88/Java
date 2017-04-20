package com.practice;

public class EvenOdd {

	public static void main(String[] args) {

		int maxLimit = 200;
		int currentLimit = 20;

		if (currentLimit <= maxLimit) {

			for (int i = 1; i <= currentLimit; i++) {

				if (i % 2 == 0) {
					System.out.println(i + "  Even");
				} else {

					System.out.println(i + "  Odd");
				}

			}

		} else {
			System.out.println("Out of Limit");
		}

	}

}
