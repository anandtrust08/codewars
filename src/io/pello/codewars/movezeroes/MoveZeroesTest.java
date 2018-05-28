package io.pello.codewars.movezeroes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MoveZeroesTest {

    private MoveZeroes moveZeroes;
    private int [] numbers;

    @BeforeEach
    void setUp() throws Exception {
        moveZeroes = new MoveZeroes();
        numbers = new int[] {1,1,0,0,2,0,1,2};
    }

    @Test
    void testSortColors() {
        int[] result = new int[] {1,1,2,1,2,0,0,0};
       assertEquals(Arrays.toString(result), Arrays.toString(moveZeroes.moveZeroes(numbers)));
    }

}
