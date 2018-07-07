package com.strm.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		
//		Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7,8,9);
//		stream.forEach(p->System.out.println(p));
		
//		Integer[] a={1,2,3,4,5,6,7,8,9};
//		Stream<Integer> stream=Stream.of(a);
//		stream.forEach(p->System.out.println(p));
//		
//		List<Integer> list=new ArrayList<Integer>();
//		for(int i=0;i<10;i++)
//		{
//			list.add(i);
//		}
//		
//		System.out.println(list);
//		
// 		Stream<Integer> stream=list.stream();
//		stream.forEach(p->System.out.println(p));
//		List<Integer> evenList=stream.filter(i->i%2==0).collect(Collectors.toList());
//		Integer[] evenList = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
//		System.out.println(evenList[3]);
//		
		
//		Stream<Date> stream=Stream.generate(()->{return new Date();});
//		
//		stream.forEach(s->System.out.println(s));
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Akash");
		
//		memberNames.stream().filter(s->s.startsWith("A"))
//		.map(String::toUpperCase)
//		.forEach(System.out::println);
		
//		memberNames.stream().sorted()
//		.map(String::toUpperCase)
//		.forEach(System.out::println);
//		Optional<String> reduced = memberNames.stream()
//				.reduce((s1,s2) -> s1 + "*" + s2);
//
//reduced.ifPresent(System.out::println);
//		
//		Stream<String> names = Stream.of("aBc", "d", "ef","ef");
//		System.out.println(names.map(s -> {
//				return s.toUpperCase();
//			}).collect(Collectors.toList()));
//		
		Stream<List<String>> namesOriginalList = Stream.of(
				Arrays.asList("Pankaj"), 
				Arrays.asList("David", "Lisa"),
				Arrays.asList("Amit"));
			//flat the stream from List<String> to String stream
			Stream<String> flatStream = namesOriginalList
				.flatMap(strList -> strList.stream());

			flatStream.forEach(System.out::println);

	}

}
