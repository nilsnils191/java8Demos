package com.nilesh.demos.lambda;

import java.util.TreeSet;

public class SortTreeSetWithLambda {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>();
		addNumbers(set);
		System.out.println(set);

		// Numbers are kept in collection in this order -1 , 0 , 1 for first parameter
		// i.e. "a" here
		// It means a<b i.e. if "a" is smaller then (keep it last in the collection)
		// means 1
		TreeSet<Integer> set2 = new TreeSet<>((a, b) -> a < b ? 1 : a > b ? -1 : 0);
		addNumbers(set2);
		System.out.println(set2);
	}

	private static void addNumbers(TreeSet<Integer> set) {
		set.add(1);
		set.add(9);
		set.add(7);
		set.add(8);
		set.add(6);
		set.add(5);
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(4);
		set.add(4);
	}

}
