package io.pello.codewars.morsecode;

import java.util.Hashtable;

public class MorseCodeDecoder {
    private Hashtable<String,String> morseCode = new Hashtable<String,String>();
    
    public MorseCodeDecoder () {
        init();
    }
    
    private void init () {
        morseCode.put(".-","A"); morseCode.put("-...","B");  morseCode.put("-.-.","C"); 
        morseCode.put("-..","D"); morseCode.put(".","E"); morseCode.put("..-.","F"); 
        morseCode.put("--.","G"); morseCode.put("....","H"); morseCode.put("..","I"); 
        morseCode.put(".---","J"); morseCode.put("-.-","K"); morseCode.put("-...","L"); 
        morseCode.put("--","M"); morseCode.put("-.","N"); morseCode.put("---","O"); 
        morseCode.put(".--.","P"); morseCode.put("--.-","Q"); morseCode.put(".-.","R"); 
        morseCode.put("...","S"); morseCode.put("-","T");  morseCode.put("..-","U"); 
        morseCode.put("...-","V"); morseCode.put(".--","W"); morseCode.put("-..-","X"); 
        morseCode.put("-.--","Y");  morseCode.put("--..","Z"); morseCode.put("-----","0"); 
        morseCode.put(".----","1"); morseCode.put("..---","2"); morseCode.put("...--","3"); 
        morseCode.put("....-","4"); morseCode.put(".....","5"); morseCode.put("-....","6"); 
        morseCode.put("--...","7");  morseCode.put("---..","8");  morseCode.put("----.","9"); 
     }
    
    public String decode(String code) {
        String[] words = code.trim().split("  ");
        String result = "";
        
        for (String word: words) {
          String[] letters = word.trim().split(" ");
          for (String letter: letters) {
            result += morseCode.get(letter);
          }
          result +=" ";
        }
        
        return result.trim();
    }
}
