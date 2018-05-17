package io.pello.codewars.stringanagrams;

public class StringAnagrams {
    public static boolean areTheyAnagram(String word1,  String word2) {
    
      if (word1.length() != word2.length()) { return false; }
      
      int[] alphabet = new int[26];
      
      for (int i = 0; i < word1.length(); i++) {
        alphabet[word1.charAt(i) - 'a']++;
        alphabet[word2.charAt(i) - 'a']--;
      }
      
      
      for (int value : alphabet) {
        if (value != 0) { return false; }
      }
      
      return true;
    }
}
