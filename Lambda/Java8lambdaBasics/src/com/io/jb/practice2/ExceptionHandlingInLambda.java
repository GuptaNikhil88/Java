package com.io.jb.practice2;

import java.util.function.BiConsumer;

public class ExceptionHandlingInLambda {

	public static void main(String []args){
		int[] a = {1,2,3,4};
		int key =2;
		
		process(a, key, wrapperLambda((v,k) -> System.out.println(v/k)));
		
	}
	
	public static void process(int[] a, int key, BiConsumer<Integer, Integer> consumer){
		for(int l: a){
		consumer.accept(l, key);	
		}
	}
	
	private static  BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		
		return (v,k) -> {
			try{
			consumer.accept(v, k);
			}
			catch(ArithmeticException e){
				System.out.println("Arithmetic Exception caught in wrapper lambda");
			}
		};
	}
	
}
