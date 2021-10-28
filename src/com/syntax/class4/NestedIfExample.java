package com.syntax.class4;

public class NestedIfExample {

	public static void main(String[] args) {
		
		boolean replCompleted=true;
		int assignments=5;
		
		if (replCompleted) {
			
		if(assignments>16) {
			System.out.println("you did an amazing job");
		}else if (assignments>10) {
			System.out.println("You did good but should do more");
		}else if (assignments<6) {
			System.out.println("You need to try to do more");
		}else {
			System.out.println("why");
		}
	
	}else {
			System.out.println("Pls make sure you do ur hw");
		}
		

	}

}
