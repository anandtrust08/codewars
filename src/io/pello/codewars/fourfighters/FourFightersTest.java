package io.pello.codewars.fourfighters;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FourFightersTest {

    @Test
    public void basicTests() {
        assertEquals(21, FourFighters.shortestTime(new int[] {3,4,5,6}));
        assertEquals(41, FourFighters.shortestTime(new int[] {3,7,10,18}));
        assertEquals(27, FourFighters.shortestTime(new int[]{5,5,6,7}));
        assertEquals(63, FourFighters.shortestTime(new int[] {5,6,30,40}));
        assertEquals(21, FourFighters.shortestTime(new int[] {5,6,3,4}));
    }

}
