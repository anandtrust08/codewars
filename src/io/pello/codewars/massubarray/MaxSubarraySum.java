package io.pello.codewars.massubarray;

public class MaxSubarraySum {
    public static int sequence(int[] arr) { // clever
        int max = 0;
        int partial_max = 0;

        for (int i = 0; i < arr.length; i++) {
            partial_max = Math.max(0, partial_max + arr[i]);
            max = Math.max(max, partial_max);
        }
        
        return max;
    }
    
    public static int sequenceBrute(int[] arr) { // Bruteforce
        int max = 0;
        int maxI = 0;
        int maxJ = -1;

        for (int i = 0; i < arr.length; i++) {
            int partial = 0;
            for (int j = i; j < arr.length; j++) {
                partial += arr[j];
                if (partial > max) {
                    max = partial;
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        
        return max;
    }
}
