package io.pello.codewars.squareup;

public class SquareUp {
    public static int[] squareUp(int n) {
    	int result [] = new int[n*n];
    	
    	for (int i=0;i< n;i++) 
    		for (int j=0;j<n; j++) 
    				result[(n*i)+j] = (n-i <= j + 1)?(n-j):0;

    	
    	return result;
    }

}
