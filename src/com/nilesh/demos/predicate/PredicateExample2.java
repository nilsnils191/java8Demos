package com.nilesh.demos.predicate;

import java.util.function.Predicate;

// Program for User Authentication by using Predicate
public class PredicateExample2 {

	static String validUser = "admin";
	static String validPass = "admin123";
	
	public static void main(String[] args) {

		Predicate<User> userAuth = u -> u.getUserName().equals("admin") && u.getPassword().equals("admin123");
		
		User user = new User(validUser,validPass);
		if(userAuth.test(user)) {
			System.out.println("Valid user details !!!!!!!!!!");
		}
		
	}

}


class User {
	String userName;
	String password;
	
	
	
	public User(String userName, String password) {
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
	
	
}