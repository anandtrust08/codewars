package io.pello.codewars.reverse_words;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ReverseWordsTest {
    @Test
    public void testSomething() {
         assertEquals(ReverseWords.reverseWords("I like eating"), "eating like I");
         assertEquals(ReverseWords.reverseWords("I like flying"), "flying like I");
         assertEquals(ReverseWords.reverseWords("The world is nice"), "nice is world The");
    }
}