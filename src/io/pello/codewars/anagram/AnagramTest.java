package io.pello.codewars.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

    @Test
    public void exampleTests() {
        assertEquals(true, Anagram.isAnagram("foefet", "toffee"));
        assertEquals(true, Anagram.isAnagram("Buckethead", "DeathCubeK"));
        assertEquals(true, Anagram.isAnagram("Twoo", "Woot"));
    }

}
