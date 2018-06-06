package io.pello.codewars.integertoenglish;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegerToEnglishTest {

    private IntegerToEnglish integerToEnglish;
    
    @BeforeEach
    void setUp() throws Exception {
        integerToEnglish = new IntegerToEnglish();
    }

    @Test
    void testNumberToEnglish() {
        assertEquals(integerToEnglish.numberToEnglish(5), "Five");
        assertEquals(integerToEnglish.numberToEnglish(42), "Forty Two");
        assertEquals(integerToEnglish.numberToEnglish(666), "Six Hundred Sixty Six");
    }

}
