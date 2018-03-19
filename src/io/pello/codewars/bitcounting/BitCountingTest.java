package io.pello.codewars.bitcounting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BitCountingTest {

    @Test
    void testCountBits() {
        assertEquals(5, BitCounting.countBits(1234)); 
        assertEquals(1, BitCounting.countBits(4)); 
        assertEquals(3, BitCounting.countBits(7)); 
        assertEquals(2, BitCounting.countBits(9)); 
        assertEquals(2, BitCounting.countBits(10)); 
    }

}
