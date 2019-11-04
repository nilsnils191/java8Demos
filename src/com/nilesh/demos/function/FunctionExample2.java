package com.nilesh.demos.function;

import java.util.function.Function;

public class FunctionExample2 {

	public static void main(String[] args) {
		
		/*****
		 *  Difference between andThen() and compose()
		 */
		Function<Integer, Integer> add = s -> s + s;
		Function<Integer, Integer> multiply = s -> s * s;
		
		System.out.println("With Andthen --> first add and then multiply applies");
		System.out.println(add.andThen(multiply).apply(2));
		
		System.out.println("With compose --> first multiply and then add applies");
		System.out.println(add.compose(multiply).apply(2));
		
	}

}


