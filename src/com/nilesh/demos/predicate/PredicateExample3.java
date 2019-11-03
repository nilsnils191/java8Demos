package com.nilesh.demos.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Predicate Example to Remove null values and Empty String from the given List?
public class PredicateExample3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		addStrings(list);

		Predicate<String> isNullorEmpty = s -> s == null || s.trim().length() == 0;

		List<String> stringToRemove = new ArrayList<>();
		
		list.forEach(s -> {
			if (isNullorEmpty.test(s)) {
				stringToRemove.add(s);
			}
		});
		
		list.removeAll(stringToRemove);

		list.forEach(s -> System.out.println(s));

	}

	private static void addStrings(List<String> list) {
		list.add("ABC");
		list.add("Nilesh");
		list.add("Neil");
		list.add(null);
		list.add("");
		list.add("Kisor");
		list.add("Nitin");
		list.add(null);
		list.add("");
		list.add("Nanded");
		list.add("Nalasopara");
		list.add("Sharad");
		list.add(null);
		list.add("");
	}
}
