package com.nilesh.demos.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Program to display names starts with 'N' by using Predicate
public class PredicateExample1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		addStrings(list);

		Predicate<String> startWithN = s -> s.startsWith("N");

		list.forEach(s -> {
			if (startWithN.test(s)) {
				System.out.println(s);
			}
		});

	}

	private static void addStrings(List<String> list) {
		list.add("ABC");
		list.add("Nilesh");
		list.add("Neil");
		list.add("Kisor");
		list.add("Nitin");
		list.add("Nanded");
		list.add("Nalasopara");
		list.add("Sharad");
	}
}
