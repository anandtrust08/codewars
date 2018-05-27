package io.pello.codewars.sortcolors;

import java.util.Arrays;

public class SortColors {
    public int[] sortColors(int[] A) {
        int indexZeroes = 0;
        int indexOnes = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                A[i] = A[indexOnes];
                A[indexOnes] = A[indexZeroes];
                A[indexZeroes] = 0;
                indexZeroes++;
                indexOnes++;
            } else if (A[i] == 1) {
                A[i] = A[indexOnes];
                A[indexOnes] = 1;
                indexOnes++;
            }
        }
        
        return A;
    }
}
