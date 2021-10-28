package com.syntax.reviewclass3;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String month="Jan";
		int day=1;
		
		if (month.equals("Jan")) {
			if(day==1) {
				System.out.println("this is the first week of Jan");
			}
		}else {
			System.out.println("this is not jan");
		}
			
		System.out.println("Code after nested if condition");

	}
}

