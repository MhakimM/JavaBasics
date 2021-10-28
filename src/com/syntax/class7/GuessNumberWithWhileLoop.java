package com.syntax.class7;

import java.util.Scanner;

public class GuessNumberWithWhileLoop {

	public static void main(String[] args) {
		
		int secretNumber=78;
		Scanner scan=new Scanner (System.in);
		int userNumber;
		
		System.out.println("Guess my secret number");
	 userNumber=scan.nextInt();
		
		while(userNumber!=secretNumber) {
			
			System.out.println("Guess my secret number");
			userNumber=scan.nextInt();
			
		}
		
		System.out.println("You got it");
		
		
	}

}
