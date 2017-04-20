package com.practice.ds;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ThreeFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		sc.close();
		StringTokenizer st = new StringTokenizer(num, ",");
		int length = st.countTokens();
		int numbers[] = new int[length];
		int sum = 0;
		for (int i = 0; i < length; i++) {
			int count = 0;
			numbers[i] = Integer.parseInt(st.nextToken());
			if (numbers[i] < 0) {
				for (int k = numbers[i]; k < Math.abs(numbers[i]); k++) {
					if (k == 0)
						continue;
					if (numbers[i] % k == 0) {
						count++;
					}
				}
				sum = sum + numbers[i];
			} else {
				for (int k = 1; k < (numbers[i]); k++) {
					if (numbers[i] % k == 0) {
						count++;
					}
				}
			}
			if (count == 3) {
				System.out.println(numbers[i]);
				sum = sum + numbers[i];
			}
		}
		System.out.println("sum:::" + sum);
	}
}
