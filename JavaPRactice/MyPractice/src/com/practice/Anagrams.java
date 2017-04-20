package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	static boolean isAnagram(String a, String b) {
		if (a.length() > 50 || b.length() > 50) {
			return false;
		}
		Map<Character, Integer> dtls1 = new HashMap<>();
		Map<Character, Integer> dtls2 = new HashMap<>();
		a = a.toLowerCase();
		b = b.toLowerCase();
		char[] schar1 = a.toCharArray();
		char[] schar2 = b.toCharArray();

		for (char s : schar1) {
			if (dtls1.containsKey(s)) {
				int count = dtls1.get(s);
				dtls1.put((Character) s, count + 1);
			} else
				dtls1.put((Character) s, 1);
		}

		for (char s : schar2) {
			if (dtls2.containsKey(s)) {
				int count = dtls2.get(s);
				dtls2.put((Character) s, count + 1);
			} else
				dtls2.put((Character) s, 1);
		}

		Iterator<Map.Entry<Character, Integer>> it = dtls1.entrySet()
				.iterator();
		while (it.hasNext()) {
			Map.Entry<Character, Integer> v = it.next();
			if (dtls2.containsKey(v.getKey())) {
				int res = dtls2.get(v.getKey()).compareTo(v.getValue());
				if (res != 0) {
					return false;
				}
			} else {
				return false;
			}

		}

		return true;

	}
	
	/*
	 * Very simple and nice code
	 * 
	 * */
static boolean isAnagram2(String a, String b) {
        
        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        if(Arrays.equals(first, second)) {
            return true;
        } else {
            return false;
        }
    }

}
