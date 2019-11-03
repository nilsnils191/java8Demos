package com.nilesh.demos.function;

import java.util.function.Function;

public class FunctionExample1 {

	public static void main(String[] args) {
		
		Function<String, Integer> calulateLength = s -> s.length();
		
		String str = "Nilesh !!!!!!!!";
		System.out.println(calulateLength.apply(str));
		
	}

}


