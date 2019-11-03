package com.nilesh.demos.consumer_supplier;

import java.util.function.Consumer;

public class ConsumerExamples {

	public static void main(String[] args) {

		Consumer<String> consumer = s -> System.out.println(s);
		
		consumer.accept("ABC");
		consumer.accept("XYZ");
		consumer.accept("ABC");
		consumer.accept("ABC");
		consumer.accept("ABC");
	}

}
