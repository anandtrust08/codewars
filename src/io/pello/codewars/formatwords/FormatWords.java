package io.pello.codewars.formatwords;

public class FormatWords {
    public static String formatWords(String[] words) {
        if (null == words || words.length == 0) return "";
        if (words.length == 1) return words[0];
        
        int start = 0;
        int finish = words.length-1;
        String result = "";
       
        for (int i=0;i<words.length;i++)
          if (!words[i].equals("")) { start = i; break; }
     
         for (int i=words.length-1;i>=0;i--)
          if (!words[i].equals("")) { finish = i; break; }
      
        if (start == finish) return words[0];
        
        for (int i=start;i<finish;i++)
          if (finish - i == 1 )
              result +=  words[i] + " and " + words[i+1];
          else
              result += words[i] + ", ";

        
        System.out.println(result);
        
        return result;
      }
}
