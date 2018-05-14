package io.pello.codewars.rotatearray;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RotateArrayTest {
    
    private   RotateArray rotateArray;
    private int [] numbers;
    
    @BeforeEach
    public void setUp() {
        rotateArray = new RotateArray();
        numbers = new int[] {1,2,3,4,5,6,7};
    }

    @Test
    void testRotate1() {
        assertArrayEquals(rotateArray.rotate(numbers, 0), numbers);
    }
    
    @Test
    void testRotate2() {
        int [] expected = new int[] {5,6,7,1,2,3,4};
        assertArrayEquals(rotateArray.rotate(numbers, 3), expected);
    }

}
