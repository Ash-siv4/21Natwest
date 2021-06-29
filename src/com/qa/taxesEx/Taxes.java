package com.qa.taxesEx;

public class Taxes {

//	Create the tax class, it contains 2 methods.
//
//	Method 1 - which takes a salary and works out the percentage 
//	by which the salary will be taxed.
//
//	Method 2 - which works out the exact amount that the user will be 
//	taxed using a similar process to that in the first method. 
//	That amount should be returned and output to the console.
//
//	These 2 methods should be able to work independently, 
//	so it is fine in this case if some of the code is repeated.*
//
//	The salaries are taxed as below:
//
//	0 - 14,999 : 0% tax
//	15,000 - 19,999 : 10% tax
//	20,000 - 29,999 : 15% tax
//	30,000 - 44,999 : 20% tax
//	45,000+ : 25% tax
//	
//	Finally combine the 2 methods so that the second method 
//	utilizes the first method to return the correct result.

	public static int taxBand(int salary) {
		int tax = 0;
		// && - both conditions have to be true
		// || - only one condition has to be true
		if (salary >= 0 && salary <= 14999) {
			System.out.println(tax + "%");
		} else if (salary >= 15000 && salary <= 19999) {
			tax = 10;
			System.out.println(tax + "%");
		} else if (salary >= 20000 && salary <= 29999) {
			tax = 15;
			System.out.println(tax + "%");
		} else if (salary >= 30000 && salary <= 44999) {
			tax = 20;
			System.out.println(tax + "%");
		} else {
			tax = 25;
			System.out.println(tax + "%");
		}
		return tax;
	}

}
