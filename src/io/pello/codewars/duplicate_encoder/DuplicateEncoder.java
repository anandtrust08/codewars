package io.pello.codewars.duplicate_encoder;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.stream.Collectors;

public class DuplicateEncoder {
	static String encode(String word){
		 String wordLower = word.toLowerCase();
		 Hashtable<String, Integer> ocurs = new Hashtable<String, Integer>();
		 String [] resultArr = new String[word.length()];
		    
		    for (int i = 0; i< wordLower.length();i++) {
		    	String s = String.valueOf(wordLower.charAt(i));
		    	ocurs.put(s, (ocurs.containsKey(s)?ocurs.get(s):0) + 1);
		    }
		    
		    for (int i = 0; i< resultArr.length;i++) {
		    	String s = String.valueOf(wordLower.charAt(i));
		    	resultArr[i] = (ocurs.get(s)>1)?")":"(";
		    }
		    String result = Arrays.stream(resultArr).collect(Collectors.joining(""));
	
		    return result;

    }
}