package com.io.jb.practice;

public class Greeters {

	public void greet(Greeting greeting) {
		
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeters greeter = new Greeters();
		
		/*Traditional Way*/
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
/*
 * USING LAMBDA EXPRESSION NOW
 * */
	Greeting myLambdaFunction = () -> System.out.println("Hello World in Lambda");
	 
	/*inner class greeting*/
	Greeting innerClassGreeting = new Greeting(){
		public void perform(){
		System.out.println("Hello World in innerclass");	
	}
	};
	
	greeter.greet(myLambdaFunction);
	greeter.greet(innerClassGreeting);
	}
}

/*interface MyLambda{
	void foo();
	
}*/

