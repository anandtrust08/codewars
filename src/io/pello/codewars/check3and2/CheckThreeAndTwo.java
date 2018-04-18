package io.pello.codewars.check3and2;

import java.util.Arrays;

public class CheckThreeAndTwo {
    public boolean checkThreeAndTwo(char[] chars) {
        Arrays.sort(chars);
        for(char c: chars)
            System.out.print(c+", ");
        
        return ((chars[0]==chars[1] && chars[0] == chars[2] && chars[3]==chars[4])  ||
           ( chars[0]==chars[1] && chars[2] == chars[3] && chars[2]==chars[4])) && (chars[0] != chars[3]);
      }
}

