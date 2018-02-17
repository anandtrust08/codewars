package io.pello.codewars;

public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        int n = strarr.length;         
        if ( n == 0 || k > n || k <= 0) { return ""; }
        
        String result = "";
       
        int lengths [] = new int[n];
        int len = 0;
        int lengthMax = 0;
        int lengthMaxAt = 0;
        
        for (int i = 0; i < k - 1; i++) {
            int stringLen = strarr[i].length();
            len += stringLen;
            lengths[i] = stringLen;
        }

        for (int i = k - 1, start = 0; i < n; i++, start++) {
            int stringLen = strarr[i].length();
            lengths[i] = stringLen;
            int thisLen = len + stringLen;
            if (thisLen > lengthMax) {
                lengthMax = thisLen;
                lengthMaxAt = start;
            }
            len += stringLen - lengths[start];
        }
       
        for (int i=lengthMaxAt;i<lengthMaxAt+k;i++) {
          result += strarr[i];
        }
        
        return result;
    }
}
