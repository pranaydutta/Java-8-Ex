package aapl.function.pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.toList;

public class Sample {
	
	public static List<Person> createPeople() {
	    return Arrays.asList(
		    new Person("Sara", Gender.FEMALE, 20),
		    new Person("Sara", Gender.FEMALE, 22),
		    new Person("Bob", Gender.MALE, 20),
		    new Person("Paula", Gender.FEMALE, 32),
		    new Person("Paul", Gender.MALE, 32),
		    new Person("Jack", Gender.MALE, 2),
		    new Person("Jack", Gender.MALE, 72),
		    new Person("Jill", Gender.FEMALE, 12)
		  );
	  }
	
	public static void greetPerson(Person person) {
	    System.out.print("Hello ");
	    
	    if(person.getGender() == Gender.FEMALE)
	      System.out.print("Ms. ");
	    else
	      System.out.print("Mr. ");
	    System.out.println(person.getName());
	  }
	
	public static void main(String[] args) {
//		
//		List<Person> people = createPeople();
//		System.out.println("Before sorting"+people);
//		Collections.sort(people, new Comparator<Person>() {
//		       public int compare(Person p1, Person p2) {
//		         return Integer.valueOf(p1.getAge()).compareTo(p2.getAge());
//		       }
//		     });
//		
//		System.out.println("After sorting"+people);
//		
//		List<String> names = new ArrayList<>();
//	     for(Person person : people) {
//	       if(person.getAge() > 20 && person.getGender() == Gender.MALE)
//	         names.add(person.getName());
//	     }                               
//	     
//	     System.out.println(names);
		
//		 System.out.println(createPeople().stream().filter(person->person.getGender()==Gender.MALE).filter(person->person.getAge()>20) .sorted(comparing(Person::getAge))
//                 .map(Person::getName)
//                 .collect(toList()));
		
		 List<Person> people = createPeople();
		// people.forEach(person -> greetPerson(person));
		 
		// people.forEach(Sample::greetPerson);
		 System.out.println("----------");
		 
		//How readable is this code?                                   
//		    System.out.println(
//		      people.stream()
//		            .map(p -> p.getAge())
//		            .filter(a -> a > 20)
//		            .reduce(0, (a, b) -> a + b));
		
		 
//		 System.out.println(
//			      people.stream()
//			            .map((Person p) -> p.getAge())
//			            .filter((Integer a) -> a > 20)
//			            .reduce(0, (Integer a, Integer b) -> a + b));
		 
		 System.out.println(
			      people.stream()
			            .map(person -> person.getAge())
			            .filter(age -> age> 20)
			            //.reduce(0, (sum, age) -> sum + age));
			            //or 
			            .reduce(0, Integer::sum));
	}

	

}
