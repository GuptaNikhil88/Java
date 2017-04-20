package com.io.jb.practice2;

public class ClosuresExample {

	public static void main(String [] args){
		
		int a = 10;
		int b = 20;
		/*Here lambda expression uses frozen value of b is called closure 
		 *  i.e., b is taken by compiler as final variable and
		 *  is in enclosing scope you are not allowed to change it*/
		doProcess(a , (i) -> System.out.println(i+b));
		/*doProcess(a , new Process(){

			@Override
			public void process(int i) {
				// TODO Auto-generated method stub
				System.out.println(a+b);
			}
			
		});*/
	}
	public static void doProcess(int i, Process p){
		p.process(i);
	}
}

interface Process{
	void process(int i);
}