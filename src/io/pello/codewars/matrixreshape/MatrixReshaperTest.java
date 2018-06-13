package io.pello.codewars.matrixreshape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatrixReshaperTest {
    private MatrixReshaper matrixReshaper;
    private int [][] matrix;
    
    @BeforeEach
    void setUp() throws Exception {
        matrixReshaper = new MatrixReshaper();
        matrix = new int[3][3];
    }

    @Test
    void testSameShape() {
       assertArrayEquals(matrixReshaper.reshape(matrix, 3, 3),matrix);
    }

    @Test
    void testShape() {
        matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expected = new int[][] {{1,2,3,4,5,6,7,8,9}};
        assertArrayEquals(matrixReshaper.reshape(matrix, 1, 9),expected);
        
        matrix = new int[][] {{1,2,3, 4},{5,6,7,8}};
        expected = new int[][] {{1,2},{3,4},{5,6},{7,8}};
        assertArrayEquals(matrixReshaper.reshape(matrix, 4, 2),expected);
    }
}
