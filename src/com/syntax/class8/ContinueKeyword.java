package com.syntax.class8;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			
			if (i==3) {
				
				continue;
				
			}
			System.out.println("Hi "+i);
			System.out.println("Hello "+i);
		}
		
		//i want to print numbers from 1-10 except number 3, 7, 9
		
		for (int i=1;i<=10; i++) {
			
			if (i==3 || i==7 || i==9) {
				continue;
			}
			System.out.print(i+" ");
			
			
			
		}
		
		
System.out.println("End of the code");
	}

}
