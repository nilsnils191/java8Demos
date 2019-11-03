package com.nilesh.demos.default_static_method;

public class TestDefaultMethod implements interface111 {
	// implementation of square abstract method
	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		TestDefaultMethod d = new TestDefaultMethod();
		d.square(4);

		// default method executed
		d.show();
	}
}

//A simple program to Test Interface default 
//methods in java 
interface interface111 {
	// abstract method
	public void square(int a);

	// default method
	default void show() {
		System.out.println("Default Method Executed");
	}
}
