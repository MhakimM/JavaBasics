package com.syntax.class6;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		/*
		 * we need to capture a country from a user
		 * based on country, have to define fave food from that country
		 */

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter country");
		String country=input.next();
		String food;
		
		switch(country) {
		case "USA":
			food="Burgers";
			break;
		case "Iran":
			food="Kabobs";
			break;
		case "Italy":
			food="Pizza";
		case "Greece":
			food="Gyro";
			break;	
			default:
				food="Unknown";
				break;}
			
		System.out.println("Fave food is "+food);
		
	}}
	

