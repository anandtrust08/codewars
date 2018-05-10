package io.pello.codewars.palindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class StringPalindromeTest {

    @Test
    void testIsPalindrome() {
       assertTrue(StringPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
       assertTrue(StringPalindrome.isPalindrome(""));
    }
    
    @Test
    void testIsNotPalindrome() {
       assertFalse(StringPalindrome.isPalindrome("No way a palindrome"));
    }

}
