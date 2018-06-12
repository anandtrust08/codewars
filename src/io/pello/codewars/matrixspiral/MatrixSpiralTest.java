package io.pello.codewars.matrixspiral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatrixSpiralTest {
    private MatrixSpiral matrixSpiral;

    @BeforeEach
    void setUp() throws Exception {
        matrixSpiral = new MatrixSpiral();
    }

    @Test
    void testSpiral() {
        assertEquals(matrixSpiral.spiral(new int[][] {}).size(), 0);
        int [][] matrix = new int[][] {{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        assertEquals(matrixSpiral.spiral(matrix).toString(),"[1, 2, 3, 6, 9, 8, 7, 4, 5]");
    }

}
