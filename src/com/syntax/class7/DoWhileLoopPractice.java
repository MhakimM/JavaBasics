package com.syntax.class7;

public class DoWhileLoopPractice {

	public static void main(String[] args) {
	
		/*
		 * print number from 30-70 using do while loop
		 * print odd numbers from 99 to 1 using do while loop
		 */
		
		int a=30;
		do {
			System.out.print(a);
			a++;
		}while (a<=70);
	
	
	int b=99;
	do {
		if(b%2==1) {
			System.out.print(b+" ");
		}
		b--;
	}while(b>=1);
		
		}

	

}
