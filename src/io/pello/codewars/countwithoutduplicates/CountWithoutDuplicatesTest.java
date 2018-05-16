package io.pello.codewars.countwithoutduplicates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountWithoutDuplicatesTest {

    @Test
    void testRemoveDuplicates() {
        assertEquals(CountWithoutDuplicates.count(new int[] { 1, 1, 2, 2, 2 }), 2);
    }

    @Test
    void testRemoveDuplicates2() {
        assertEquals(CountWithoutDuplicates.count(new int[] { 1, 1, 1, 1, 1 }), 1);
    }

    @Test
    void testRemoveDuplicates3() {
        assertEquals(CountWithoutDuplicates.count(new int[] { 1, 2, 3, 3, 3, 4, 4 }), 4);
    }
}
