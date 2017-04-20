package com.io.jb.practice;

public class RunnableExample {
	public static void main(String[] args) {

		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside Runnable");

			}

		});
		myThread.run();
/*
 * In here as runnable has only one method so we can sneak in a lambda expression,
 * had there been more than one method we could not have done so!!
 * */
		
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Runnable lambda"));
		myLambdaThread.run();
	}

}
