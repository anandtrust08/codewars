package io.pello.codewars.addbinary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddBinaryTest {

    @Test
    void testAddBinary() {
        assertEquals(AddBinary.addBinary("11", "1"), "100");
    }

}
