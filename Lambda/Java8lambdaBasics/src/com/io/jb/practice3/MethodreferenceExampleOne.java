package com.io.jb.practice3;

public class MethodreferenceExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Thread t = new Thread(() -> printMessage());
		//Exactly same as above
		Thread t = new Thread(MethodreferenceExampleOne::printMessage);
	}

	public static void printMessage(){
		System.out.println("Hello");
	}
}
