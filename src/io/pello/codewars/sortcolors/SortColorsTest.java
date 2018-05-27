package io.pello.codewars.sortcolors;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortColorsTest {
    
    private SortColors sortColors;
    private int [] numbers;

    @BeforeEach
    void setUp() throws Exception {
        sortColors = new SortColors();
        numbers = new int[] {1,1,0,0,2,0,1,2};
    }

    @Test
    void testSortColors() {
        int[] result = new int[] {0,0,0,1,1,1,2,2};
       assertEquals(Arrays.toString(result), Arrays.toString(sortColors.sortColors(numbers)));
    }

}
