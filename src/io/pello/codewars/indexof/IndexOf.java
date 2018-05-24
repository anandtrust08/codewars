package io.pello.codewars.indexof;

public class IndexOf {
    public int indexOf(String haystack, String needle) {
        if (needle == null || haystack == null) { return -1;} 
        
        for (int i = 0;; i++) {
            for (int j = 0;; j++) {
                if (j == needle.length()) {
                    return i;
                }
                
                if (i + j == haystack.length()) {
                    return -1;
                }
                
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }
        }
    }
}
