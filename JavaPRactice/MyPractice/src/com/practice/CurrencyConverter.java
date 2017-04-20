package com.practice;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        
	        // Write your code here.
	        
	        
	         NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
	         NumberFormat nfi = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
	         NumberFormat nfc = NumberFormat.getCurrencyInstance(Locale.CHINA);
	         NumberFormat nff = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        //NumberFormat.get
	         
	         String us = nf.format(payment);
	         String india = nfi.format(payment);
	         String china = nfc.format(payment);
	         String france = nff.format(payment);
	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	    }
}


