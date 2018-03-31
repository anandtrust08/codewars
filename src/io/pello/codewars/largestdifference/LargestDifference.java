package io.pello.codewars.largestdifference;

public class LargestDifference {

    public static int largestDifference (int[] data) {
        int max = 0;
        for (int i = 0; i< data.length;i++) 
            for (int j = i; j< data.length; j++) 
                if (data[i] <= data[j]) 
                    max = Math.max(max, j - i);

        
        return max;
    }
}
