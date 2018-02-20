package io.pello.codewars.spinwords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
	  public String spinWords(String sentence) {
		  String[] words = sentence.split(" ");
		  StringBuilder sb = new StringBuilder();
		  
		  for (String s: words)
				  sb.append(((s.length() > 4)?new StringBuilder(s).reverse().toString():s)+" ");
		  
		  return sb.toString().substring(0,sb.length()-1);
	  }
}
