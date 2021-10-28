package com.syntax.class3;

public class IfConditionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp=60;
		
		if (temp >=60) {
			System.out.println("I am going to beach");
		}else {
			System.out.println("I will go for a walk");
		}
		
		String userName="Mariam";
		String pw="pass123";
		if(userName.equals("Mariam")) {
			System.out.println("Hi Mariam");
		}else {
			System.out.println("I don't know you");
			
			//for Strings only == and != are allowed but not recommended to use
		}
		
	}

}
