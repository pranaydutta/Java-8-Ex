package com.strm.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Ex {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		/*//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		//System.out.println(squaresList);
		numbers.forEach(System.out::println);*/
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl", "", "");

		//get count of empty string
		int count = (int)strings.parallelStream().filter(string -> string.isEmpty()).count();
		//System.out.println(count);
		
		//Stream.of(10,20,22,12,14).reduce((x,y)->x+y).ifPresent(System.out::println);
		 
        Stream.of(10,20,22,12,14).reduce(Integer::sum).ifPresent(System.out::println);
 
        //Stream.of("java", "c", "c#", "python").reduce((x,y)->x+" | "+y).ifPresent(System.out::println);
     
 

	}

}
