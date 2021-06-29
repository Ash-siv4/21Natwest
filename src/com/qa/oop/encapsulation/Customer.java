package com.qa.oop.encapsulation;

public class Customer {
	//bank

	//constructors - right-click,source, generate constructor using fields
	//constructors have the same name as the class and we use it to initialise variables
	public Customer(String name, String address, boolean attitude, int cvc, int age, int riskBandLevel) {
		this.name = name;
		this.address = address;
		this.attitude = attitude;
		this.cvc = cvc;
		this.age = age;
		this.riskBandLevel = riskBandLevel;
	}

	//variables
	private String name;
	private String address;
	private boolean attitude;
	private int cvc;
	private int age;
	private int riskBandLevel;
	
	//public methods to access our private variables
	
	//getters & setters - right-click, source, generate getters+setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isAttitude() {
		return attitude;
	}
	public void setAttitude(boolean attitude) {
		this.attitude = attitude;
	}
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRiskBandLevel() {
		return riskBandLevel;
	}
	public void setRiskBandLevel(int riskBandLevel) {
		this.riskBandLevel = riskBandLevel;
	}
	
	
	
}
