package com.nilesh.demos.lambda;

import java.util.TreeMap;

public class SortTreeMapKeysWithLambda {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>();
		addNumbers(map);
		System.out.println(map);

		System.out.println("Now printing in reverse order using comparator");
		TreeMap<Integer, String> map2 = new TreeMap<>((a, b) -> a < b ? 1 : a > b ? -1 : 0);
		addNumbers(map2);
		System.out.println(map2);

	}

	private static void addNumbers(TreeMap<Integer, String> map) {
		map.put(1, "ABC");
		map.put(9, "zzzz");
		map.put(7, "dsfsd");
		map.put(8, "aaa");
		map.put(6, "xxx");
		map.put(5, "aaa");
		map.put(2, "qqq");
		map.put(3, "aa");
		map.put(3, "uuu");
		map.put(4, "ppp");
		map.put(4, "qqq");
	}

}
