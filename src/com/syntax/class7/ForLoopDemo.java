package com.syntax.class7;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		/*
		 * 1.initialization
		 * 2.condition
		 * 3.increment/decrement
		 */
		
		for(int i=1; i<=5; i++) {
			System.out.println("hello");
		}
		
		
		System.out.println("---Print numbers from 1 to 20---");
		
		/*
		 * 1.start point
		 * 2.end point
		 * 3.increment/decrement
		 */
		
		
		for(int i=1; i<=20; i++) {
			System.out.print(i+" ");
			}
		System.out.println();
		System.out.println("---Print numbers from 100 to 20---");
		
		for(int i=100; i>=20; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("---Print EVEN numbers from 1 to 50---");
		
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
			System.out.print(i+" ");
			}
			
			
			System.out.println();
			System.out.println("---Print EVEN numbers from 1 to 50---");
			
			
			for (int b=2; b<=50; b+=2) {
				System.out.print(b+" ");
			}
			
			System.out.println();
			System.out.println(" ----what is the output---");
			
			for(int c=1;c<=20; c+=5) {
				System.out.print(c+" ");
			}
		
			
		}
		
	}
		
		
}


