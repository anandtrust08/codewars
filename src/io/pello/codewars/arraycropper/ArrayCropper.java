package io.pello.codewars.arraycropper;

public class ArrayCropper {
	   public static int[][] getCroppedFieldAsArray(int[][] src) {
		   int maxh = 0;
		   int maxv = 0;
		   
		   for (int i=0;i<src.length;i++)
			   for (int j=src[i].length-1;j>=0;j--)
				   if (src[i][j] == 0 && j >= maxh)
					   maxh = j;
				   else
					   break;

		   for (int i=src.length-1;i>=0;i--) {
			   boolean allZero = true;
			   for (int j=0;j<src[i].length;j++) {
				   if (src[i][j] == 1) {
					   allZero = false;
					   break;
				   }
		   		}
			   if (allZero)
				   maxv = i;
		   }
		   
		  // System.out.println("Let see: maxh: " + maxh + " maxv: " + maxv);	   
		   int result[][] = new int[maxv][maxh];
		   
		   for (int i=0;i<maxv;i++)
			   for (int j=0;j<maxh;j++) 
				   result[i][j] = src[i][j];

		     return result;
	   }
}
