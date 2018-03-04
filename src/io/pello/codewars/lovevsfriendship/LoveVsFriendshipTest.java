package io.pello.codewars.lovevsfriendship;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;

class LoveVsFriendshipTest {

    @Test
    public void testSomething() {
        assertEquals(100, LoveVsFriendship.wordsToMarks("attitude"));
        assertEquals(75, LoveVsFriendship.wordsToMarks("friends"));
        assertEquals(66, LoveVsFriendship.wordsToMarks("family"));
        assertEquals(99, LoveVsFriendship.wordsToMarks("selfness"));
        assertEquals(96, LoveVsFriendship.wordsToMarks("knowledge"));
        assertEquals(225, LoveVsFriendship.wordsToMarks("incomprehensibility"));
    }
    
    @Test
    public void randomTests() {
        for (int i=0;i<40;i++) {
          String word = generateRandomWord();
          assertEquals(solution(word), LoveVsFriendship.wordsToMarks(word));
        }
    }
    
    private String generateRandomWord () {
      Random random = new Random();
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      String word = "";
      int size = random.nextInt(50);
      
      for (int i = 0;i<size;i++)
        word += alphabet.charAt(random.nextInt(alphabet.length()))+"";
        
      return word;
    }
    
  private int solution (String text) {
		int total = 0;
		for (int i =0;i< text.length();i++)
			total += text.charAt(i)-96;

		return total;
  }
  
}
