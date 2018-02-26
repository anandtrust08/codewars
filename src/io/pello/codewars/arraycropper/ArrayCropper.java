package io.pello.codewars.arraycropper;

import java.util.*;
public class ArrayCropper {
	public static int[][] removeRows(int[][] src) {

		List<int[]> numbers = new ArrayList<int[]>();
		for (int i = 0; i < src.length; i++)
			numbers.add(src[i]);
		
		System.out.println("Total size: " + numbers.size());;

		for (int i = src.length-1; i >=0; i--) {
			boolean allZero = true;
			for (int j = 0; j < src.length; j++) {
				if (src[i][j] == 1) {
					allZero = false;
					break;
				}
			}
			if (allZero) {
				numbers.remove(i);
			}
		}
		int x = numbers.size();
		int y = numbers.size() > 0 ? numbers.get(0).length : 0;
		int[][] result = new int[x][y];

		for (int i = 0; i < numbers.size(); i++)
			for (int j = 0; j < numbers.get(i).length; j++)
				result[i][j] = numbers.get(i)[j];

		return result;
	}

	public static int[][] getCroppedFieldAsArray(int[][] src) {
		int maxh = 0;
		int minh = src.length-1;
		int maxv = 0;
		int minv = src.length-1;

//		for (int i = 0; i < src.length; i++) {
//			int minpartial = src[i].length - 1;
//			int maxpartial = 0;
//			for (int j = 0; j < src[i].length; j++)
//				if (src[i][j] == 1) {
//					minpartial = (j < minpartial) ? j : minpartial;
//					maxpartial = (j > maxpartial) ? j : maxpartial;
//					}
//
//			maxh = (maxpartial > maxh) ? maxpartial : maxh;
//			minh = (minpartial < minh) ? minpartial : minh;
//		}

		
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
		//
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = src[i+minv][j+minh];
				System.out.print(result[i][j] + ", ");
			}

			System.out.println("");
		}

		return result;
	}

	public static void printArray(int[][] src) {
		System.out.println("Array: ");
		for (int i = 0; i < src.length; i++) {
			for (int j = 0; j < src[i].length; j++)
				System.out.print(src[i][j] + ", ");

			System.out.println("");
		}
	}
}