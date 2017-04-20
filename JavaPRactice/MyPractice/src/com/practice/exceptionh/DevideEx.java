package com.practice.exceptionh;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.corba.se.impl.io.TypeMismatchException;

public class DevideEx {
	public static void main(String []args){
		
		try{
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(a/b);
			
		}
		catch(ArithmeticException e){
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
		catch(InputMismatchException e){
			System.out.println("java.util.InputMismatchException");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
