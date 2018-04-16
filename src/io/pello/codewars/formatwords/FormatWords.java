package io.pello.codewars.formatwords;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FormatWords {
    public static String formatWords(String[] words) {
        if (null == words || words.length == 0)
            return "";
              
        for (int i=0;i<words.length;i++)
            if (words[i].length()>0)
            words[i] = cleanString(words[i]);
        

        List<String> wordList = new LinkedList<>(Arrays.asList(words));
        
        for (int i = wordList.size()-1; i >= 0; i--) 
            if (wordList.get(i).trim().equals("") || wordList.get(i).trim().equals(",")) 
                wordList.remove(i);
                
          
      
        if (wordList.size() == 1)
            return wordList.get(0);

        String result = "";

        for (int i = 0; i < wordList.size() - 1; i++)
            if (wordList.size() - i == 2)
                result += wordList.get(i) + " and " + wordList.get(i + 1);
            else
                result += wordList.get(i) + ", ";


        return result;
    }
    
    public static String cleanString (String word) {
        String[] w = word.split(",");
        String result = "";
        
        for (int i=0;i<w.length;i++)
            if (!w[i].trim().equals(""))
                result += w[i].trim()+", ";
        
        
        return result.substring(0,result.length()-2);
    }
}
