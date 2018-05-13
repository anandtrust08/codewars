package io.pello.codewars.numberpalindrome;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NumberPalindromeTest {

    @Test
    void testIsPalindrome() {
        assertTrue(NumberPalindrome.isPalindrome(12321));
        assertTrue(NumberPalindrome.isPalindrome(1221));
    }

    @Test
    void testIsNotPalindrome() {
        assertFalse(NumberPalindrome.isPalindrome(-12321));
        assertFalse(NumberPalindrome.isPalindrome(13321));
    }

}
