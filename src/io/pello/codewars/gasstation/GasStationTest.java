package io.pello.codewars.gasstation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GasStationTest {
    private GasStation gasStation;
    
    @BeforeEach
    void setUp() throws Exception {
        gasStation = new GasStation();
    }

    @Test
    void testCanCompleteCircuit() {
        int [] gas = new int[] {10,10,20,10,20};
        int [] cost = new int[] { 20, 24, 7,10,3};
        assertEquals(gasStation.canCompleteCircuit(gas, cost), 2);
    }

    @Test
    void testCannotCompleteCircuit() {
        int [] gas = new int[] {5,6,5,4,10};
        int [] cost = new int[] { 20, 24, 7,10,3};
        assertEquals(gasStation.canCompleteCircuit(gas, cost), -1);
    }
}
