package io.pello.codewars.morsecode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class MorseCodeDecoderTest {

    private MorseCodeDecoder morseCodeDecoder = new MorseCodeDecoder();

    @Test
    void testDecode() {
        assertEquals(morseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), "HEY JUDE");
    }

}
