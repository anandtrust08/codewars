package io.pello.codewars.reverseinteger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

    @Test
    void testReverse() {
        assertEquals(321, ReverseInteger.reverse(123));
    }

}
