package com.nilesh.demos.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		List<Integer> list = getList();
		
		// Get sum of numbers greater than 10
		int sum = list.stream().filter(p->p>10).mapToInt(i->i).sum();
		System.out.println("Get sum of numbers greater than 10 : "+sum);
		
		/**
		 *  We can use reduce() to perform a reduction on the elements of the stream,
		 *   using an associative accumulation function, and return an Optional.
		 *    Let’s see how we can use it multiply the integers in a stream.
		 */
		System.out.println("reduce example to print the sum");
		Stream<Integer> numbers = Stream.of(5,2,3);
		Optional<Integer> optional = numbers.reduce((i,j)->i+j);
		System.out.println(optional.get());
		
		List<String> strList = new ArrayList<>();
		strList.add("Apple");strList.add("Banana");strList.add("Ant");strList.add("orange");
		Optional<String> optionalStr  = strList.stream().reduce((s1,s2)->s1+" , "+s2);
		System.out.println("printing values separated by , using reducce -> "+optionalStr.get());
		
		
		// Get total elements greather than 10
		long count= list.stream().filter(p->p>10).count();
		System.out.println("Get total elements greather than 10 : "+count);
		
		// Print sorting 
		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		List<String> result = names.stream().sorted().collect(Collectors.toList());
		result.forEach(p-> System.out.println(p));
		
		
	}
	
	
	private static List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		list.add(2);list.add(3);
		list.add(4);list.add(5);
		list.add(6);list.add(7);
		list.add(8);list.add(9);
		list.add(10);list.add(11);
		list.add(12);list.add(13);
		return list;
	}

}
