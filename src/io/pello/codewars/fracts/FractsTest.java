package io.pello.codewars.fracts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FractsTest {

    @Test
    public void test_fractions() throws Exception {
        long[][] lst;
        lst = new long[][] { { 1, 2 }, { 1, 3 }, { 1, 4 } };
        assertEquals("(6,12)(4,12)(3,12)", Fracts.convertFrac(lst));
    }
}
