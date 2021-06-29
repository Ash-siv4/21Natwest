package com.qa.arrays;

import java.util.ArrayList;

public class Arrays2 {

	
	public static void arrayList() {
		int[] age = {1,2,3};
		
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Ford");//0
		cars.add("Chevy");//1 0
		cars.add("Honda");//2 1
		cars.add("Ford");//3  2
		cars.get(2);
		cars.remove(0);
		cars.clear();


		
	}
	
}
