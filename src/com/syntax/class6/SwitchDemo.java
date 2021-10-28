package com.syntax.class6;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/*
		 	*rules:
			*1. values in case MUST be same datatype as a VARIABLE in switch
			*2. cannot have duplicate cases!
			*/
			

		char gender = 'h';
		String description;

		switch (gender) {

		case 'm':
			description = "Male";
			break;
		case 'f':
			description = "Female";
			break;
		default:
			description = "Unknown";
		}

		System.out.println(gender + " means " + description);
		
		/*
		 * limitation of operators
		 * 1. cannot use logical operators
		 * 2. cannot use relational operators
		 *
		 * limitation of datatype
		 * 1. cannot use boolean datatype
		 * 2. cannot use double/float datatype
		 * 3. cannot use long
		 *  
		 
		 */
		
	}
	
}
