package io.pello.codewars.reversestring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseStringRecursiveTest {
    
    private ReverseStringRecursive reverseStringRecursive;

    @BeforeEach
    void setUp() throws Exception {
        reverseStringRecursive = new ReverseStringRecursive();
    }
    
    @Test
    void testReverseStringEdge() {
       assertNull(reverseStringRecursive.reverseString(null));
       assertEquals(reverseStringRecursive.reverseString(""),"");
       assertEquals(reverseStringRecursive.reverseString("a"),"a");
    }

    @Test
    void testReverseStringEven() {
       assertEquals(reverseStringRecursive.reverseString("abcdef"),"fedcba");
    }

    @Test
    void testReverseStringOdd() {
       assertEquals(reverseStringRecursive.reverseString("abcdefg"),"gfedcba");
    }
}
