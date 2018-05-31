package io.pello.codewars.singlenumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingleNumberTest {
    private SingleNumber singleNumber;
    
    @BeforeEach
    void setUp() throws Exception {
        singleNumber = new SingleNumber();
    }

    @Test
    void testSingleNumber() {
        int [] numbers = new int[]{4,9,2,2,42,4,9,1,1};     
        assertEquals(singleNumber.singleNumber(numbers),42);
    }

}
