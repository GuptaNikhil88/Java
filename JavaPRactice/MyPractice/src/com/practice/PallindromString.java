package com.practice;

import java.util.Scanner;

public class PallindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String S = in.next();
		char[] schar = S.toCharArray();
		in.close();

		boolean flag = true;
		int i1 = 0;
		int i2 = schar.length - 1;
		while (i2 > i1) {
			if (schar[i1] != schar[i2]) {
				flag = false;
			}
			++i1;
			--i2;
		}

		if (flag)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
