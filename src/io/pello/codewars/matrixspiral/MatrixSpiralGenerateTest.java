package io.pello.codewars.matrixspiral;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MatrixSpiralGenerateTest {
    
    private MatrixSpiralGenerate matrixSpiralGenerate;

    @BeforeEach
    void setUp() throws Exception {
        matrixSpiralGenerate = new MatrixSpiralGenerate();
    }

    @Test
    void testGenerateMatrix() {
        assertArrayEquals(matrixSpiralGenerate.generate(1), new int[][]{{1}});
    }

    @Test
    void testGenerateComplex() {
        int [][] expected = new int[][] {{ 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };
        assertArrayEquals(matrixSpiralGenerate.generate(3), expected);
    }
}
