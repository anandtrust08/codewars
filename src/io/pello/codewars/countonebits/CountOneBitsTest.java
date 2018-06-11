package io.pello.codewars.countonebits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountOneBitsTest {
    private CountOneBits countOneBits;

    @BeforeEach
    void setUp() throws Exception {
        countOneBits = new CountOneBits();
    }

    @Test
    void testCount() {
        assertEquals(countOneBits.count(0),0);
        assertEquals(countOneBits.count(1),1);
        assertEquals(countOneBits.count(2),1);
        assertEquals(countOneBits.count(42),3);
    }

}
