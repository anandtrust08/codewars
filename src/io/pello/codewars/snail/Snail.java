package io.pello.codewars.snail;

public class Snail {
    private static int k=0;
    public static int[] snail(int[][] array) {
        int [] result = new int[array.length*array.length];

        int i = 0;
        int j = 0;

        int times = 1;
        right(array, result, 0, array[0].length);
        i++;
        j = array.length-i;
        printar(result, i, j);
        System.out.println("Beg: " + times);
        
        while (times <= (array.length-1)) {
            System.out.println("Beg: " + times);
            if (times % 2 != 0) {
                System.out.println("Gping down, left " + times);
               // down(array, result, i, array[i].length);
               // left(array, result, i, j);
            } else {
                System.out.println("Gping right, upt " + times);
               // up(array, result, i, j);
               // right(array, result, i, array[i].length);
            }
            times = times + 1;
            System.out.println("End: " + times);;
        }

        return null;
      }
    
    private static void printar(int[] result, int i, int j) {
        for (int x=0;x<result.length;x++)
            System.out.print(result[x]+", ");    
       
        System.out.println("\n Pos: [" + i +"," + j + "]");
    }
    
    private static void right(int[][] array, int[] result, int i, int j) {
       for (int x=i;x<j;x++)
           result[k++] = array[i][x];
        
    } 
    
    private static void down(int[][] array, int[] result, int i, int j) {
        for (int x=i;x<j;x++)
            result[k++] = array[i][x];
    }
    
    private static void left(int[][] array, int[] result, int i, int j) {

    }

    private static void up(int[][] array, int[] result, int i, int j) {

    }

}
