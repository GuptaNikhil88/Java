package com.io.jb.practice;

public class TypeInferenceExample {
	public static void main(String[] args) {

		//StringLengthLambda myLambda = (String s) -> s.length(); -- works
		//StringLengthLambda myLambda = (s) -> s.length(); -- works 
		StringLengthLambda myLambda = s -> s.length(); // still works!!!
		
		System.out.println(myLambda.getLength("Hello Lambda"));
	}

	public static void  printLambda(StringLengthLambda l){
		System.out.println(l.getLength("Hello Lambda"));
		
	}
	interface StringLengthLambda {
		int getLength(String s);
	}
}
