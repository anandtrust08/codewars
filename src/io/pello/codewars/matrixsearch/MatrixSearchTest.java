package io.pello.codewars.matrixsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatrixSearchTest {
    private MatrixSearch matrixSearch;
    private int[][] matrix;
    @BeforeEach
    void setUp() throws Exception {
        matrixSearch =  new MatrixSearch();
        matrix = new int[][] { {1, 15, 5, 7}, {10, 11, 3, 20}, {23, 30, 34, 50}};
    }

    @Test
    void testSearch() {
        assertFalse(matrixSearch.search(matrix, 42));
        assertTrue(matrixSearch.search(matrix, 50));    
        assertTrue(matrixSearch.search(matrix, 5));
    }

}
