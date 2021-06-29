package com.qa.oop.polymorphism;

public class Car extends Vehicle{

	
	public Car(String reg, int wheels, String model) {
		super(reg, wheels, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void brand() {
		System.out.println("audi");
	}
	
	
	
	
}
