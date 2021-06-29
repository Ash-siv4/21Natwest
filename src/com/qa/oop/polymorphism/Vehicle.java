package com.qa.oop.polymorphism;

public class Vehicle {

	// variables
	private String reg;
	private int wheels;
	private String model;

	// constructor - to set initial values
	public Vehicle(String reg, int wheels, String model) {
		this.reg = reg;
		this.wheels = wheels;
		this.model = model;
	}

	public Vehicle(String reg, int wheels) {
		this.reg = reg;
		this.wheels = wheels;
	}

	// non-static method must be called by creating an object/instance of the class
	public void brand() {
		System.out.println("ford");
	}

}
