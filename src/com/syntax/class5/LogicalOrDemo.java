package com.syntax.class5;

import java.util.Scanner;

public class LogicalOrDemo {

	public static void main(String[] args) {

		/*
		 * ask user to enter today's day if monday or friday--> no class if tues or
		 * wed--> manual class if sat or sun-->Java
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("pls enter today's day");

		String day = scan.next();

		if (day.equals("mon") || day.equals("fri")) {
			System.out.println("no class");

		} else if (day.equals("tues") || day.equals("wed")) {
			System.out.println("manual class");

		} else if (day.equals("sat") || day.equals("sun")) {
			System.out.println("we have java");

		} else if (day.equals("thurs")) {
			System.out.println("we have review class");

		} else {
			System.out.println("wrong input");

		}
	}

}
