package com.qa.switchCases;

public class Days {

	public static String daysOfWeek(String today) {
		String converted = today.toLowerCase();
		
		switch (converted) {
		case "monday":
			System.out.println("mondays suck");
			break;
		case "tuesday":
			System.out.println("tuesday is meh");
			break;
		case "wednesday":
			System.out.println("wednesday - half way");
			break;
		case "thursday":
			System.out.println("thursday - 1 more");
			break;
		case "friday":
			System.out.println("friday - freedom is close");
			break;
		case "saturday":
			System.out.println("saturday!!!");
			break;
		case "sunday":
			System.out.println("SUNDAAAY");
			break;
		default:
			System.out.println("invalid day");
			break;
		}
		return null;
	}

}
