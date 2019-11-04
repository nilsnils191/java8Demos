package com.nilesh.demos.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamParallel {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 100; i++) {
			list.add(i);
		}
		// Here creating a parallel stream
		list.parallelStream().forEach(p->System.out.println(p));;
	}
}