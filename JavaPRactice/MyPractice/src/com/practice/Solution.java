package com.practice;

import java.util.Scanner;

public class Solution {
	
	static boolean flag = true;
	 static Scanner scan = new Scanner(System.in);
	 static int B =  scan.nextInt();
	static int H = scan.nextInt();
	static {
	   try{
	      if(B<=0 || H<=0){
	       // throw new java.lang.Exception();
	          flag = false;
	       throw new Exception("Breadth and height must be positive");
	    }
	   }
	    catch(Exception e){
	        System.out.println(e); 
	     }
	   }
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		/*int n = 9;
		String x = String.valueOf(n);*/
		
	}//end of main

}//en


