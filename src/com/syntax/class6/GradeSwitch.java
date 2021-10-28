package com.syntax.class6;

import java.util.Scanner;

public class GradeSwitch {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter grade");
		String grade=input.next();
		String explanation;	
		
		switch(grade) {
		case "A":
			explanation="Excellent";
			break;
		case "B":
			explanation="Good";
			break;
		case "C":
			explanation="Average";
			break;
		case "D":
			explanation="Bad";
			break;
		default:
			explanation="Not acceptable";
			
		}
		
		System.out.println("Your grade is "+grade+" and you are performing "+explanation);
			
		}
		
		

	}


