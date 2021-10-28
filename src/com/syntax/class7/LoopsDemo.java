package com.syntax.class7;

import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
		
		//I want to ask a user their name and age 5 times*/
		
		
		Scanner scan=new Scanner (System.in);
		
		int i=10;
		
		while(i<=15) {
		
		System.out.println("Please enter ur name and age");
		
		String name=scan.next();
		int age=scan.nextInt();
		
		System.out.println("Your name is "+name+" and you are "+age+" years old");
	
		i++;}
	}

}
