package com.nilesh.demos.default_static_method;

//Implementation class code 
public class TestDefaultMethodAmbiguity implements TestInterface1, TestInterface2 {

	// Overriding default show method
	public void show() {
		// use super keyword to call the show
		// method of TestInterface1 interface
		TestInterface1.super.show();

		// use super keyword to call the show
		// method of TestInterface2 interface
		TestInterface2.super.show();
	}

	/**
	 * 
	 * Duplicate default methods named show with the parameters () and () are
	 * inherited from the types TestInterface2 and TestInterface1
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		TestDefaultMethodAmbiguity d = new TestDefaultMethodAmbiguity();
		d.show();
	}
}

// A simple Java program to demonstrate multiple 
// inheritance through default methods. 
interface TestInterface1 {
	// default method
	default void show() {
		System.out.println("Default TestInterface1");
	}
}

interface TestInterface2 {
	// Default method
	default void show() {
		System.out.println("Default TestInterface2");
	}
}
