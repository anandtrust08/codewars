package io.pello.codewars.dashatize;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DashatizeTest {

    @Test
    void testDashatize() {
        assertEquals("3-42",Dashatize.dashatize(-342));
        assertEquals("3-4-3",Dashatize.dashatize(343));
        assertEquals("46-7-3-4-3",Dashatize.dashatize(467343));
    }

}
