package com.syntax.class7;

public class ForLoopClassTasks {

	public static void main(String[] args) {

		/*
		 * Print numbers from 1 to 100 in 1 line with space 
		 * Print numbers from 100 to 1
		 * Print even numbers from 20 to 1 (2 ways) 
		 * Print odd numbers between 20 and 50 (2 ways)
		 */

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int f = 100; f >= 1; f--) {
			System.out.print(f + " ");
		}

		System.out.println();

		for (int g = 20; g >= 1; g--) {
			if (g % 2 == 0)
				System.out.print(g + " ");
		}

		System.out.println();

		for (int h = 20; h <= 50; h++) {
			if (h % 2 != 0)
				System.out.print(h + " ");

		}
	}

}
