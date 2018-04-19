package io.pello.codewars.snail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;
import java.util.Arrays;
import java.util.Random;
import static java.util.stream.Collectors.joining;

public class SnailTest {

  @Test
    public void SnailTest1() {
        int[][] array
                = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[] r = new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5};
        test(array, r);
        int[][] array2
                = new int[][]{{1, 2, 3, 1},
                {4, 5, 6, 4},
                {7, 8, 9, 7},
                {7, 8, 9, 7}};
                
        int[] r2 = new int[]{1, 2, 3, 1, 4, 7, 7, 9, 8, 7, 7, 4, 5, 6, 9, 8};
        test(array2, r2);
        int[][] array3
            = new int[][] 
                   {{9, 2, 9, 3, 6},
                    {0, 8, 7, 6, 8},
                    {9, 2, 3, 0, 3},
                    {9, 3, 5, 4, 8},
                    {7, 1, 4, 0, 8}};
        int[] r3 = {9, 2, 9, 3, 6, 8, 3, 8, 8, 0, 4, 1, 7, 9, 9, 0, 8, 7, 6, 0, 4, 5, 3, 2, 3};
        test(array3, r3);
    }
    
   public String int2dToString(int[][] a) {
        return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
    }

    public void test(int[][] array, int[] result) {
        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
        System.out.println(text);
       // Snail.snail(array);
        Assert.assertArrayEquals( result, Snail.snail(array));
    }

   
}