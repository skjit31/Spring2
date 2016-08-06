package com.sanjeev.service;

public class UserDetail {
	
	private String name;
	private int age;
	private UserService userService;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public String toString() {
		return "UserDetail [name=" + name + ", age=" + age + ", userService="
				+ userService + "]";
	}
	
	
}
