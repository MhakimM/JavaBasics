package com.syntax.class4;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean vaccine=false;
		
		int dose=2;
		
		if(vaccine) {
			System.out.println("How many doses have been taken?");
			
			if(dose==1) {
				System.out.println("When are you taking your second dose");
			} else {
				System.out.println("You are fully vaccinated");
				
				
			}
		}
		
		System.out.println("---------------------------------------------");
		
		String day="Monday";
		int date=13;
		int time=24;
		
		if(day.equals("Friday")) {
			System.out.println("I am going to the movies today");
			
			if(date==13) {
				System.out.println("I am watching a scary movie");
			}else {
				System.out.println("I am watching a comedy movie");
			}
		}else {
			System.out.println("I am going to study");
			
			if(time>23) {
				System.out.println("I have to go to sleep cuz i have class");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
			
		
	}

}
