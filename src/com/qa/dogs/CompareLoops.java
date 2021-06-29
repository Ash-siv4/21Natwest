package com.qa.dogs;

public class CompareLoops {
	public static void whileL() {
		int count = 0;
		System.out.println("-----While Loop-----");
		while(count<2) {// 2<2 - false
			count++;// 1, 2
			System.out.println(count); // does not print
		}
	}
	public static void doWhile() {
		int count = 0;
		System.out.println("-----do-While Loop-----");

		do {
			count++;// 2+1 = 3
			System.out.println(count); // print out 3
		}
		while (count<2);// 3<2 - false - does not loop
		
	}
}
