package io.pello.codewars.validatecreditcard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidateCreditCard {
	public static boolean validate(String n){
		  int[] numbers = new int[n.length()];

		  for (int i = 0; i < n.length(); i++) 
		  	numbers[i] = Character.digit(n.charAt(i), 10);

		    int even = 1;
		    int sum = 0;
		    for (int i=numbers.length-1;i>=0;i--) {
		    	if (even++ % 2 == 0) {
		    		numbers[i] = (numbers[i] * 2 > 9)?(numbers[i] * 2) - 9:numbers[i] * 2;
		    		
		    	}sum += numbers[i];
		    }
		    		System.out.println(sum + ":" +n + " -> ");
		    for (int i = 0;i< n.length();i++) {
				System.out.print(numbers[i] + ", ");
		    }
		    return sum % 10 == 0;
		  }
}
