package com.syntax.class5;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a CC");
		
		String answer=input.next();
		
		if(answer.equals("yes") || answer.equals ("yep") || answer.equals("yeah")) {
			System.out.println("please tell me the balance");
		}else {
			System.out.println("Do you want to apply for CC");
			

		}
		
		System.out.println("end of the code");
		
	}

}
