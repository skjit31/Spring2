package com.sanjeev.service;

public class Address {
	
	private String name;
	private String dist;
	private String zip;
	private UserDetail userDetail;
	
	Address(){
		this.name="rahatmina";
		this.dist="araria";
		this.zip="8454331";
	}
	
	Address(String name,String dist,String zip){
		System.out.println("######Address cons###########");
		this.name=name;
		this.dist=dist;
		this.zip=zip;
	}
	
	Address(String name,String dist,String zip,UserDetail userDetail){
		this.name=name;
		this.dist=dist;
		this.zip=zip;
		this.userDetail=userDetail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	
	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", dist=" + dist + ", zip=" + zip
				+ ", userDetail=" + userDetail + "]";
	}

	
	
}
