package com.qa.oop.objects;

public class Runner {

	public static void main(String[] args) {
		
		//non-static way of calling a non-static method
		Dog fluffy = new Dog();//object
		fluffy.setName("fluffy");
		fluffy.setBreed("chichi");
		System.out.println("fluffy: ");
		fluffy.age();
		
		
		Dog rover = new Dog();
		rover.setBreed("terrier");
		System.out.println("rover: ");
		rover.age();
		
		//static way of calling a static method
		System.out.println("static");
		Dog.age();
	}
	
}
