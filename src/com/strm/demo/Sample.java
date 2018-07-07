package com.strm.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

 class Sample1 {
	
	  public void printIt(int number) { System.out.println(number);}

}
public class Sample extends Sample1 {
	
	  //public void printIt(int number) { System.out.println(number);}
	  
	  public void use(List<Integer> numbers) {
	    //numbers.forEach(i -> printIt(i));
		 // numbers.forEach(this::printIt);
	    numbers.forEach(super::printIt);
	  } 

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3,4,  6, 7, 8, 9, 10);
	//	numbers.forEach(i->System.out.println(i));
		//numbers.forEach(System.out::println);
//		Predicate<Integer> isGT14 = isGT(14);
//	    //System.out.println(isGT14.test(77));
//	    Predicate<Integer> isEven = number -> number % 2 == 0;
//	    System.out.println(isEven.test(4));
//	    
//	}
//	 public static Predicate<Integer> isGT(int value) {
//		    return number -> number > value;
//		 
	//System.out.println(	numbers.stream().filter(i->i>2).filter(i->i%2==0).mapToInt(i->i*5).sum());
	System.out.println("----");
//	numbers.stream()
//            .map(i -> Integer.lowestOneBit(i))
//            .forEach(System.out::println);
	
//	numbers.stream()
//    .map(Integer::lowestOneBit)
//    .forEach(System.out::println);
	
	 // new Sample().use(numbers);
	  
	  System.out.println("----");
	  
//	  numbers.stream()
//      .map(Integer::doubleValue)
//      .forEach(System.out::println);
	  
	  System.out.println("----");
	  
//	   System.out.println(
//	       numbers.stream()
//	              .reduce(0, (sum, i) -> Integer.sum(sum, i)));
//	  System.out.println(
//		      numbers.stream()
//		             .reduce(0, Integer::sum));
	  System.out.println("----");
	   
//	     System.out.println(
//	       numbers.stream()
//	              .reduce(0, (prev, i) -> prev.compareTo(i)));
	  
//	  System.out.println(
//		      numbers.stream()
//		             .reduce(0, Integer::compareTo));  
	  
	  int[] num = new int[] {10, 7, 8, 4, 8, 19, 12, 15};
	    int[] empty = new int[] {};
	    printMin(num);
	    //printMin(empty);
	    
}
	
//	 public static void printMin(int[] values) { //oops, what if empty?
//		     int result = Integer.MAX_VALUE;
//		     System.out.println(result);
//		     for(int e : values) {
//		       if(e < result)
//		         result = e;
//		     }              
//		     
//		     System.out.println(result);
//		   }
//	 
	 
	 public static void printMin(int[] values) {
		    System.out.println(Arrays.stream(values).min());
		  } 
}