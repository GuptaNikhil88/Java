package com.io.jb.practice2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.io.jb.common.Person;

public class U1LambdaPredicate {

	public static void main(String []args){

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Step 1: Sort list by last name
	Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// Step 2: Create a method that prints all elements in the list
	System.out.println("Printing all details:");
			//printConditionally(people, p -> true );	
		performConditionally(people, p -> true, p -> System.out.println(p) );
		// Step 3: Create a method that prints all people that have last name beginning with C 
			System.out.println("Printing details for LastName starting with C:");
			//printConditionally(people, p -> p.getLastName().startsWith("C"));
			/*Here we are passing the functionality only*/
			performConditionally(people, p -> p.getLastName().startsWith("C"), p ->System.out.println(p.getFirstName()));
		
	}
	//Using predicate as the functional interface Here
	/**
	 * We are also using COnsumer interface to pass in the behavior not just the condition
	 * 
	 * */
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer ) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
	

	
	
}
