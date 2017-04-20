package com.io.jb.practice3;

import java.util.Arrays;
import java.util.List;

import com.io.jb.common.Person;

public class CollectionIterationExample {
	
	public static void main(String[] args) {

	List<Person> people = Arrays.asList(
			new Person("Charles", "Dickens", 60), new Person("Lewis",
					"Carroll", 42), new Person("Thomas", "Carlyle", 51),
			new Person("Charlotte", "Bronte", 45), new Person("Matthew",
					"Arnold", 39));
	System.out.println("USing for loop::");
	for (int i = 0; i<people.size();i++){
		System.out.println(people.get(i));
	}
	
	System.out.println("USing for each loop::");
	for (Person p: people){
		System.out.println(p);
	}
	
	//Iteration for-each in Java 8
	System.out.println("Using Lambda foreach ::");
	//people.forEach(p -> System.out.println(p));
	people.forEach(System.out::println); // Even Better internal iterator, 
										//	Processor can run multiple records in parallel --> Parallel processing 
	
	}
}
