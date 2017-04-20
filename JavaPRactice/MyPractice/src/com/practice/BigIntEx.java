package com.practice;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntEx {

	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		BigInteger a = s.nextBigInteger();
		BigInteger b = s.nextBigInteger();
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		
		
		
	}
}
