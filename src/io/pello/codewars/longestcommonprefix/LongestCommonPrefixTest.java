package io.pello.codewars.longestcommonprefix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {
    private LongestCommonPrefix longestCommonPrefix;
    
    @BeforeEach
    void setUp() throws Exception {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    void testEdgeCases() {
        assertEquals(longestCommonPrefix.longestCommonPrefix(null), "");
        assertEquals(longestCommonPrefix.longestCommonPrefix(new String[] {}), "");
    }

    
    @Test
    void testLongestCommonPrefix() {
        String [] words = new String[] {"abraxsf","abraca23","abracadabra","abraracr"};
        assertEquals(longestCommonPrefix.longestCommonPrefix(words), "abra");
    }

}
