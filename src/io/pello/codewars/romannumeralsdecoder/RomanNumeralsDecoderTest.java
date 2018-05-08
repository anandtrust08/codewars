package io.pello.codewars.romannumeralsdecoder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumeralsDecoderTest {

    private RomanNumeralsDecoder conversion = new RomanNumeralsDecoder();

    @Test
    public void shouldCovertToRoman() {
        assertEquals("solution(1) should equal to I", 1, conversion.solution("I"));
        assertEquals("solution(4) should equal to IV", 4, conversion.solution("IV"));
        assertEquals("solution(6) should equal to VI", 6, conversion.solution("VI"));
    }
}