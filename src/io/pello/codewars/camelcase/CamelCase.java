package io.pello.codewars.camelcase;

public class CamelCase {
    static String toCamelCase(String s){
        String result = "";
        String[] res = s.split("\\-|\\_");
        if (null == s || s.length() == 0) return "";
        result += res[0].charAt(0) + res[0].substring(1,res[0].length()).toLowerCase();
        
        for (int i = 1;i< res.length;i++) 
           result += String.valueOf(res[i].charAt(0)).toUpperCase() + res[i].substring(1,res[i].length()).toLowerCase();
        
        return result;
      }
}
