package com.io.jb.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.io.jb.common.Person;

public class Unit1Exercise {
	public static void main(String []args){

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Step 1: Sort list by last name
	Collections.sort(people, new Comparator<Person>() {

		@Override
		public int compare(Person p1, Person p2){
						return p1.getLastName().compareTo(p2.getLastName());
		}
		

	});
		
		// Step 2: Create a method that prints all elements in the list
		for(Person p: people){
			System.out.println(p.getFirstName()+ " "+ p.getLastName()+ " Age: "+ p.getAge());
					}
		// Step 3: Create a method that prints all people that have last name beginning with C 
		for(Person p: people){
			if(p.getLastName().charAt(0) == 'c' ||p.getLastName().charAt(0) == 'C')
			System.out.println(p.getFirstName()+ " "+ p.getLastName()+ " Age: "+ p.getAge());
					}
		
	}
	
}
