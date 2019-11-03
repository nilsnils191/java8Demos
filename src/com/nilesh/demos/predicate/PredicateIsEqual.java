package com.nilesh.demos.predicate;

import java.util.function.Predicate;


// Here we need to oveeride equals method from object class in Employee class
public class PredicateIsEqual {
	public static void main(String[] args) {

		
		Predicate<Employee> isCEO = Predicate.isEqual(new Employee("CEO", "admin123"));
		
		Employee emp1 = new Employee("CEO", "admin");
		Employee emp2 = new Employee("CEO", "admin123");
		Employee emp3 = new Employee("MGM", "admin");
		
		System.out.println(isCEO.test(emp1));
		System.out.println(isCEO.test(emp2));
		System.out.println(isCEO.test(emp3));
		
	}

}



class Employee {
	String userName;
	String password;
	
	
	
	public Employee(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	
	
}