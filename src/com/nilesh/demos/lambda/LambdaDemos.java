package com.nilesh.demos.lambda;

public class LambdaDemos {

	public static void main(String[] args) {

		MyFirstLambda mi = () -> System.out.println("Hello");
		mi.test();

		Calculation ci = (a, b) -> a + b;
		System.out.println(ci.add(1, 3));

		Calculation ci2 = (a, b) -> {
			return a + b;
		};

		System.out.println(ci2.add(2, 3));

	}
}

@FunctionalInterface
interface MyFirstLambda {

	public void test();
}

@FunctionalInterface
interface Calculation {

	public int add(int a, int b);
}