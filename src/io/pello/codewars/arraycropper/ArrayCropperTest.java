package io.pello.codewars.arraycropper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayCropperTest {
    @Test
    public void test() {
       int[][][] example = {
          {{0,1,0,0},
           {0,0,1,0},
           {1,1,1,0},
           {0,0,0,0}},
          {{0,1,0},
           {0,0,1},
           {1,1,1}}
        };
        int[][] res = ArrayCropper.getCroppedFieldAsArray(example[0]);
        assertEquals(example[1], res);
    }
    
    @Test
    public void test2() {
       int[][][] example = {
          {{0,1,0,0,0,0},
           {0,0,1,0,0,0},
           {1,1,1,0,1,0},
           {0,0,0,0,0,0}},
          {{0,1,0,0,0},
           {0,0,1,0,0},
           {1,1,1,0,1}}
        };
        int[][] res = ArrayCropper.getCroppedFieldAsArray(example[0]);
        assertEquals(example[1], res);
    }

}
