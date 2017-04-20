package com.practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BigDecimalEx {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {

				BigDecimal a = new BigDecimal(s1);
				BigDecimal b = new BigDecimal(s2);
				return b.compareTo(a);

			}
		};
		Arrays.sort(s, 0, n, comparator);

		/*
		 * List<BigDecimal> bds = new ArrayList<BigDecimal>(); BigDecimal bd;
		 * for(int i=0;i<n;i++){ bd = new BigDecimal(s[i]); bds.add(bd); }
		 * Collections.sort(bds, Collections.reverseOrder()); bds.toArray();
		 * for(int i=0;i<n;i++){ s[i] = bds.get(i).toPlainString(); }
		 */

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}
