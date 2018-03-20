package io.pello.codewars.bitcounting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BitCountingConversionTest {

    @Test
    void testCountBits() {
        assertEquals(5, BitCountingConversion.countBits(1234)); 
        assertEquals(1, BitCountingConversion.countBits(4)); 
        assertEquals(3, BitCountingConversion.countBits(7)); 
        assertEquals(2, BitCountingConversion.countBits(9)); 
        assertEquals(2, BitCountingConversion.countBits(10)); 
    }

}
