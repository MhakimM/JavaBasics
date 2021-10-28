package com.syntax.class6;

import java.util.Scanner;

public class LanguageTask {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter country");
		String country=input.next();
		String language;
		
		switch(country) {
		case "USA":
			language="English";
			break;
		case "Iran":
			language="Farsi";
			break;
		case "Italy":
			language="Italian";
			break;
		case "Greece":
			language="Greek";
			break;	
			default:
				language="Unknown";
				break;}
			
		System.out.println("User speaks "+language);
		
		
		

	}

}
