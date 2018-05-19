package io.pello.codewars.longestcommonprefix;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs == null || strs.length < 1) { return ""; }

          Arrays.sort(strs);

          char[] firstWord = strs[0].toCharArray();
          char[] lastWord = strs[strs.length-1].toCharArray();

          for (int i = 0; i < firstWord.length; i++) {
            if (lastWord.length > i && lastWord[i] == firstWord[i]) {
              result += lastWord[i];
            } else {
              return result;
            }
          }
          
        return result;
      }
}
