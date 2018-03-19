package io.pello.codewars.arraycropper;

public class ArrayCropper {
	public static int[][] getCroppedFieldAsArray(int[][] src) {
		int maxh = 0;
		int minh = src.length-1;
		int maxv = 0;
		int minv = src.length-1;

		for (int i = 0; i < src.length; i++) {
			int minpartial = src[i].length - 1;
			int maxpartial = 0;
			int minvpartial = src[i].length - 1;
			int maxvpartial = 0;
			for (int j = 0; j < src[i].length; j++) {
				if (src[j][i] == 1) {
					minvpartial = (j < minvpartial) ? j : minvpartial;
					maxvpartial = (j > maxvpartial) ? j : maxvpartial;
					}
				if (src[i][j] == 1) {
					minpartial = (j < minpartial) ? j : minpartial;
					maxpartial = (j > maxpartial) ? j : maxpartial;
					}
			}
			maxh = (maxpartial > maxh) ? maxpartial : maxh;
			minh = (minpartial < minh) ? minpartial : minh;
			maxv = (maxvpartial > maxv) ? maxvpartial : maxv;
			minv = (minvpartial < minv) ? minvpartial : minv;
		}
		
		System.out.println("Let see: minh: " + minh + " maxh: " + maxh + " length: " + src.length + ":" + ((maxh - minh) + 1));
		System.out.println("Let see: minv: " + minv + " maxv: " + maxv + " length: " + src.length + ":" + ((maxv - minv) + 1));

		int result[][] = new int[(maxv - minv) + 1][(maxh - minh) + 1];

		for (int i = 0; i < result.length; i++) 
			for (int j = 0; j < result[i].length; j++) 
				result[i][j] = src[i+minv][j+minh];

		return result;
	}

}