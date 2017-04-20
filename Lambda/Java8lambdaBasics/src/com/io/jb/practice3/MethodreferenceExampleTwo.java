package com.io.jb.practice3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.io.jb.common.Person;

public class MethodreferenceExampleTwo {
	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), new Person("Lewis",
						"Carroll", 42), new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45), new Person("Matthew",
						"Arnold", 39));

		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all details:");

		performConditionally(people, p -> true, System.out::println); // p -> method(p)
	}

	// Using predicate as the functional interface Here
	/**
	 * We are also using COnsumer interface to pass in the behavior not just the
	 * condition
	 * 
	 * */
	private static void performConditionally(List<Person> people,
			Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
