package com.practice;

public class BearCat {

	public static void main(String[] args) {

		int maxLimit = 1000;
		int currentLimit = 100;

		if (currentLimit <= maxLimit) {

			for (int i = 1; i <= currentLimit; i++) {

				if (i % 12 == 0) {
					System.out.println("BearCat");
				} else if (i % 4 == 0) {

					System.out.println("Bear");
				} else if (i % 6 == 0) {

					System.out.println("Cat");
				} else {
					System.out.println(i);
				}

			}

		} else {
			System.out.println("Out of Limit");
		}

	}

}
