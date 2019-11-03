package com.nilesh.demos.predicate;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {

		Predicate<Integer> greaterThan10 = i -> i>10;
		Predicate<Integer> lessThan100 = i -> i<100;
		
		Integer num = 95;
		
		boolean testingNum = greaterThan10.and(lessThan100).test(num);
		
		System.out.println(testingNum);
		
		num = 101;
		testingNum = greaterThan10.and(lessThan100).test(num);
		System.out.println(testingNum);
	}

}
