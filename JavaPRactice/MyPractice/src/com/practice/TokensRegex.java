package com.practice;

import java.util.Scanner;

public class TokensRegex {
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	         	 String pattern = "([^A-Za-z]+)";
	        //String pattern = "([,\\s\\-:\\?\\!\\.\\_\\'\\@]{1,})";
	        	 if(scan.hasNextLine()){
	     	        //String pattern = "(\\W+)";
	                 String s = scan.nextLine();
	     	       //  String pattern = "([,\\s\\-:\\?\\!\\.\\_\\'\\@\\d]{1,})";
	     	        String[] sarray = s.trim().split(pattern);
	                if(sarray.length ==1 && sarray[0].matches("")){
	                	 System.out.println("0");	
	                }
	                else{
	     	        System.out.println(sarray.length);
	                }
	     	        for(String n: sarray){
	     	        System.out.println(n);
	     	        }
	                  }
	     	        
	     	        else{
	     	        	System.out.print("0");

	     	        }

	     	        scan.close();
	         }
	     }
