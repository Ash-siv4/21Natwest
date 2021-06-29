package com.qa.oop.abstraction;

public abstract class WebPage {
	// abstract classes - can have methods with a body and without a body
	

	//home button
	public void homeButton() {
		System.out.println("home");
	}
	
	//layout
	 void layout() {
		 
	 };//methods with no body - aka: abstract methods
	
	//form to submit - fill out details
	abstract void form();
	
}
