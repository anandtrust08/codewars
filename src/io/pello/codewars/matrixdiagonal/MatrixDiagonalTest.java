package io.pello.codewars.matrixdiagonal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatrixDiagonalTest {
    
    private MatrixDiagonal matrixDiagonal;

    @BeforeEach
    void setUp() throws Exception {
        matrixDiagonal = new MatrixDiagonal();
    }

    @Test
    void testArrange() {
        char[][] input = new char[][]{
            { 'a','b'},
            { 'c','d'}  };
    char[][] output = new char[][]{
            { 'a','c'},
            { 'b','d'}  };
      assertArrayEquals(
            output,
            matrixDiagonal.arrange(input));
            
    char[][] t = new char[][]{
            { '1','d','3'},
            { 'e','5','f'},
            { 'H','I','9'}  };
     assertArrayEquals(
            new char[][]{
            { '1','3','f'},
            { 'd','5','I'},
            { 'e','H','9'}  },
            matrixDiagonal.arrange(t));
            
    char[][] t2 = new char[][]{
            { '1','2','3'},
            { '4','5','6'},  };
    assertArrayEquals(
            new char[][]{
            { '1','3','5'},
            { '2','4','6'},  },
            matrixDiagonal.arrange(t2));
    }

}
