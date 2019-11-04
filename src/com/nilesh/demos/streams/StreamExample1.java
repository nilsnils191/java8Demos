package com.nilesh.demos.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Integer> list = getList();
		
		// consumer to print elements
		Consumer<Integer> consumer = (i) -> System.out.print(i+" , ");
		
		// Filter example to get even numbers
		System.out.println("\n 1) Filter example to get even numbers : ");
		list.stream().filter(p->p%2==0).collect(Collectors.toList()).forEach(consumer);
		
		// Map example to increment each element by 1
		System.out.println("\n\n 2) Map example to increment each element by 1: ");
		list.stream().map(i -> i + 1).collect(Collectors.toList()).forEach(consumer);
		
		// Get any element greater than 1
		System.out.println("\n\n 3) Get any element greater than 10 : it returns random values");
		Optional<Integer> num = list.stream().filter(p->p>10).findAny();
		System.out.println("Value found ? "+num.isPresent() +" and value is ->" +num.get());
		
		// Get any element greater than 1
		System.out.println("\n\n 3) Get first element greater than 10 : ");
		Optional<Integer> num2 = list.stream().filter(p->p>10).findFirst();
		System.out.println("Value found ? "+num2.isPresent() +" and value is ->" +num2.get());
				
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
