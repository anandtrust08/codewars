package io.pello.codewars.matrixsquareup;

public class MatrixSquareUp {

	  public static String[][] matrixSquareUp(int b) {
		  String [][]result = new String[b][b];
		  
		  for (int i=0;i<b;i++)
			  for (int j=b-1;j>=0;j--)
				  result[i][j] = (j+1+i>=b)?(b-j)+"":"x";
		  
	    return result;
	    }
}
