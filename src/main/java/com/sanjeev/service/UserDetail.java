package com.sanjeev.service;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserDetail {
	
	private String name;
	private int age;
	private UserService userService;
	private List<Integer> phoneNo;
	private Set<String> language;
	private Map<String,String> data;
	private Properties properties;
	
	
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
	
	
	public List<Integer> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(List<Integer> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Set<String> getLanguage() {
		return language;
	}
	public void setLanguage(Set<String> language) {
		this.language = language;
	}
	public Map<String, String> getData() {
		return data;
	}
	public void setData(Map<String, String> data) {
		this.data = data;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "UserDetail [name=" + name + ", age=" + age + ", userService="
				+ userService + ", phoneNo=" + phoneNo + ", language="
				+ language + ", data=" + data + ", properties=" + properties
				+ "]";
	}
	

	
	
}
