package com.practice.ds;

import java.util.Scanner;

public class OneDArray {
	
public static void main(String []args){
	 Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int a[] = new int[n];
	for (int i = 0; i<n;i++){
		a[i] = s.nextInt();
	}
	 s.close();

     // Prints each sequential element in array a
     for (int i = 0; i < a.length; i++) {
         System.out.println(a[i]);
     }
}
}
