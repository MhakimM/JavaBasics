package com.syntax.class8;

public class NestedLoops {

	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) {          //outer loop
			
			System.out.println(i);
			
			
			for (int j=1; j<=4; j++) {    //inner loop
				
				System.out.println(j);
				
			}
		}
	}

}
