package com.nilesh.demos.consumer_supplier;

import java.util.function.Supplier;

public class SupplierExamples {

	public static void main(String[] args) {

		String s[] = { "A", "B", "Z", "Y", "P", "R" };

		Supplier<String> sup = () -> {
			int random = (int)(Math.random()*6);
			return s[random];
		};
		
		for (int i = 0; i < 100; i++) {
			System.out.println(sup.get());	
		}

	}
}
