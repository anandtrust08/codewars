package io.pello.codewars.dashatize;

public class Dashatize {
    public static String dashatize (int number) {
        String result = "";
        String [] chars = (Math.abs(number)+"").split("");
        
        for (int i = 0; i< chars.length;i++) {
           if ( Integer.parseInt(chars[i]) % 2 != 0) {
               result += "-" + chars[i] + "-";
           } else {
               result += chars[i];
           }   
           System.out.println(result);
        }
        
        result = result.replace("--","-");
        
        if (result.startsWith("-")) {
            result = result.substring(1,result.length());
        }
        
        if (result.endsWith("-")) {
            result = result.substring(0,result.length()-1);
        }
            
        return result;
    }
}
