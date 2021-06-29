package com.qa.arrays;

public class Arrays {

	public static void arrayExample() {

		String[] names = { "bob0", "mickey1","bob2", "mickey3","bob4", "mickey5"};
		int[] age = { 25, 35, 45 };

		System.out.println(names[1] + " " + age[1]);
		
		int[][] age2 = {{ 25, 35, 45 },{ 2, 3, 5 }};
		//[row][col]
		System.out.println(age2[1][2]);//5
//		col: 	0 	1 	2
//		row0: 	25	35	45
//		row1:	2	3	5
		
//		System.out.println("names list--------------");
//		for(int count=0;count<names.length;count++) {
//			System.out.println(names[count]);
//		}

	}

}
