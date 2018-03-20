package io.pello.codewars.bitcounting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BitCountingClassyTest {

    @Test
    void testCountBits() {
        assertEquals(5, BitCountingClassy.countBits(1234)); 
        assertEquals(1, BitCountingClassy.countBits(4)); 
        assertEquals(3, BitCountingClassy.countBits(7)); 
        assertEquals(2, BitCountingClassy.countBits(9)); 
        assertEquals(2, BitCountingClassy.countBits(10)); 
    }

}
