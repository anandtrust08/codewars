package io.pello.codewars.stringanagrams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringAnagramsTest {

    @Test
    void testIsAnagram() {
       assertTrue(StringAnagrams.areTheyAnagram("orange","gerona"));
       assertTrue(StringAnagrams.areTheyAnagram("rat","tar"));
    }

    @Test
    void testIsNotAnagram() {
       assertFalse(StringAnagrams.areTheyAnagram("orange","oviedo"));
       assertFalse(StringAnagrams.areTheyAnagram("rat","tat"));
    }

}
