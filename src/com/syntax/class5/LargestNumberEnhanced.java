package com.syntax.class5;

import java.util.Scanner;

public class LargestNumberEnhanced {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("pls enter 3 numbers");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();

		double largest=0;

		if (num1 >= num2 && num1 > num3) {

			largest = num1;

		} else if (num2 >= num3 && num3 >= num1) {

			largest = num2;

		} else if (num3 > num2 && num3 >= num1) {

			largest = num3;

			
			boolean isEven;
			
			if (largest%2==0) {
				isEven=true;
			}else {
				isEven=false;
			}
			
			System.out.println(largest+" number is even "+isEven);
			
		}

	}

}