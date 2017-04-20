package com.io.jb.practice2;

public class ThisReferenceExample {

	public  void doProcess(int i, Process p){
		p.process(i);
	}

	public void execute(){
		//This ===  ?
		doProcess(10, i -> {
			System.out.println("Value of i is "+ i);
			System.out.println(this); //
		});
	}
	
	public static void main(String []args){
		ThisReferenceExample  thisReferenceExample = new ThisReferenceExample();
/**
 * Lambda expression does not do that: it does not override the this reference!!
 * 
 * */
		/*thisReferenceExample.doProcess(10, i -> {
			System.out.println("Value of i is "+ i);
			//System.out.println(this); // This will not work!!!
		});*/
		
		thisReferenceExample.execute();
		
		/*Traditional way, this reference is overridden by the this reference of anonymous inner class*/
		/*thisReferenceExample.doProcess(10, new Process(){

			@Override
			public void process(int i) {
				// TODO Auto-generated method stub
			System.out.println("Value of i is "+ i);
			System.out.println(this);
			}
			
			public String toString(){
				return "this is the anonymus inner class";
			}
			
		});
*/		
	}
	public String toString(){
		return "this is ThisReferenceExample class instance";
	}
}
