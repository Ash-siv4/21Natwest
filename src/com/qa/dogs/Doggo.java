package com.qa.dogs;

public class Doggo {

	public static void whileLoop() {
		System.out.println("----------------while");
		int dogs = 2;
		while (dogs<2) {
			// sysout then hit ctrl+space
			System.out.println("gimme dog");
			dogs++;// 0+1 = 1, 1+1 =2
			System.out.println("Dogs = " + dogs);
		}
	}
	
	public static void doLoop() {
		System.out.println("------------do-while");
		int dogs = 2;
		do {
			System.out.println("gimme dog");
			dogs++;
			System.out.println("Dogs = " + dogs);
		}while(dogs<2);
	}
}
