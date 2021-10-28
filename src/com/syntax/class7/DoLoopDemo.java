package com.syntax.class7;

import java.util.Scanner;

public class DoLoopDemo {

	public static void main(String[] args) {
		
	/*
	 * let's create a secret number (1 to 100)
	 * 
	 * ask user to guess secret number (have to guess til they get it right, keep asking)
	 * 
	 * keep asking for a number until user guesses secret number correctly 
	 */
		
		
		int secretNumber=78;
		Scanner scan=new Scanner (System.in);
		int userNumber;
		
		do {
			System.out.println("Guess my secret number");
			
			userNumber=scan.nextInt();
			
		}while (userNumber!=secretNumber);
		
		System.out.println("You got it");
		
	
		}
}
		
	

