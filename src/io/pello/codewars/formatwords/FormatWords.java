package io.pello.codewars.formatwords;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FormatWords {
    public static String formatWords(String[] words) {
        if (null == words || words.length == 0)
            return "";


        List<String> wordList = new LinkedList<>(Arrays.asList(words));
        
        for (int i = wordList.size()-1; i >= 0; i--) 
            if (wordList.get(i).equals("")) 
                wordList.remove(i);
      
        if (wordList.size() == 1)
            return wordList.get(0);

        String result = "";

        for (int i = 0; i < wordList.size() - 1; i++)
            if (wordList.size() - i == 2)
                result += wordList.get(i) + " and " + wordList.get(i + 1);
            else
                result += words[i] + ", ";

        System.out.println(result);

        return result;
    }
}
