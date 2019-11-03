package com.nilesh.demos.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCustomClassWithLambda {

	public static void main(String[] args) {

		List<Employee> allEmps = new ArrayList<>();
		addNumbers(allEmps);
		System.out.println("Un sorted list");
		System.out.println(allEmps);

		List<Employee> allEmps2 = new ArrayList<>();
		addNumbers(allEmps2);
		System.out.println("Sorted list in ascending order of id");
		Collections.sort(allEmps2, (e1, e2) -> e1.getId() > e2.getId() ? 1 : e1.getId() < e2.getId() ? -1 : 0);
		System.out.println(allEmps2);
	}

	private static void addNumbers(List<Employee> list) {
		list.add(new Employee(1, "ABC"));
		list.add(new Employee(9, "zzzz"));
		list.add(new Employee(7, "dsfsd"));
		list.add(new Employee(8, "aaa"));
		list.add(new Employee(6, "xxx"));
		list.add(new Employee(5, "aaa"));
		list.add(new Employee(2, "qqq"));
		list.add(new Employee(3, "aa"));
		list.add(new Employee(3, "uuu"));
		list.add(new Employee(4, "ppp"));
		list.add(new Employee(4, "qqq"));
	}

}

class Employee {

	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}