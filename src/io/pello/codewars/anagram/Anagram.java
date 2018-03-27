package io.pello.codewars.anagram;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) return false;
        char [] t = test.toLowerCase().toCharArray();
        char [] o = original.toLowerCase().toCharArray();
        Arrays.sort(t);
        Arrays.sort(o);
        
        for (int i = 0;i< t.length;i++)
            if (t[i] != o[i])
                return false;
        
        return true;
      }
}
