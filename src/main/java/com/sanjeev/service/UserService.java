package com.sanjeev.service;

public class UserService {
	
	UserService(){}
	
	private String name="sanjeev";
	private String password="password";
	
	public String getName() {
		System.out.println("getName");
		return name;
	}

	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}

	public String getPassword() {
		System.out.println("getPassword");
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setPassword");
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserService [name=" + name + ", password=" + password + "]";
	}
	
	
}
