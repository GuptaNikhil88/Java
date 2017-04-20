package com.practice;

import java.util.Scanner;

public class LexicSubstr {

	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int sublen = in.nextInt();
	        in.close();
	        String min = S.substring(0,sublen);
	        String max =  S.substring(0,sublen);
	        int strlen = S.length();
	        
	        for(int i = 1 ; i<strlen; i++){
	        	if(i+sublen <=strlen){
	        	String temp = S.substring(i,i+sublen);
	        	if(min.compareTo(temp)>0){
	        		min = temp;
	        	}
	        	if(max.compareTo(temp)<0){
	        		max = temp;
	        	}
	        	}
	        
	        }
	        System.out.println(min);
	        System.out.println(max);
	   
	}
	
}
