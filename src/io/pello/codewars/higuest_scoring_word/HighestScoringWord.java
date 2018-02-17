package io.pello.codewars.higuest_scoring_word;

public class HighestScoringWord {
	  public static String high(String s) {
		    String [] words = s.split(" ");
	
		    int index = 0;
		    int max = 0;
		    
		    for (int i = 0; i< words.length; i++) {
		    	int size = getWordSize(words[i]);
		    	if (size > max) {
		    		index = i;
		    		max = size;
		    	}
		    }
		    
		    return words[index];
		  }

			private static int getWordSize(String string) {
			    String alphabet = "abcdefghijklmnopqrstuvwxyz";
			    int total = 0;
			    for(int i=0;i<string.length();i++) 
			    	total += alphabet.indexOf(string.charAt(i)) + 1;
			    	
			    
				return total;
			}

		}
