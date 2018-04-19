package io.pello.codewars.snail;

public class Snail {
    private static int k=0;
    public static int[] snail(int[][] array) {
        k = 0;
        
        if (array == null || (array.length == 1 && array[0].length==0)) { return new int[]{};}
        if (array.length==1 && array[0].length==1) { return array[0];}
        
        int [] result = new int[array.length*array.length];
        int [] position = new int[] {0,0};

        int len = array[0].length;

        int times = 1;
        position = right(array, result, position[0], position[0], len);
        
        position[0]++;
        position[1] = array.length-position[0];
        

        System.out.println("Beg: " + times);
        
        while (times <= (array.length-1)) {
            if (times % 2 != 0) {
               position= down(array, result, position[0], position[1], --len);
               position[1]--;
               position= left(array, result, position[0], position[1], len);
               len--;
            } else {
               position = up(array, result, position[0], position[1], len);       
               position = right(array, result,position[0], position[1], len);
               position[0]++;
            }
            times = times + 1;
        }

        return result;
      }
    
    private static int[] right(int[][] array, int[] result, int i, int j, int len) {
       for (int x=0;x<len;x++)
           result[k++] = array[i][j+x];
        
       return new int[]{i,j+len-1};
    } 
    
    private static int[] down(int[][] array, int[] result, int i, int j, int len) {
        for (int x=0;x<len;x++)
            result[k++] = array[i+x][j];
        
        return new int[]{i+len-1,j};
    }
    
    private static int[] left(int[][] array, int[] result, int i, int j, int len) {
        for (int x=0;x<len;x++)
            result[k++] = array[i][j-x];
         
        return new int[]{i-1,j-len+1};
    }

    private static int[] up(int[][] array, int[] result, int i, int j, int len) {
        for (int x=0;x<len;x++)
            result[k++] = array[i-x][j];
        
        return new int[]{i-len+1,j+1};
    }

}
