package com.qa.calEx;

public class Runner {

	// main then ctrl+space then hit enter
	public static void main(String[] args) {
		
		// sysout then ctrl+space
		
		System.out.println("ADD: " + Calculator.add(4, 11));//4+11 - 15
		System.out.println("SUB: " + Calculator.sub(67, 11));//67-11 - 56
		System.out.println("MUL: " + Calculator.mul(4, 11));//4*11 - 44
		System.out.println("DIV: " + Calculator.div(5, 2));//5/2 - 2.5 - 2
		System.out.println("hi");
		System.out.println("Remainder: " + Calculator.remainder(5, 2));// 5/2 - get the remainder which is 1
		System.out.println("Odd/Even result: " + Calculator.oddEven(5));
	}
	
}