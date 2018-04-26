package io.pello.codewars.antistring;

public class AntiString {
    public static String antiString(String str){
        String result = "";
        for (int i = 0; i< str.length();i++) {
            char c = str.charAt(i);
            
           if ((int)c >= 65 && (int)c<=90) {
               result += (c+"").toLowerCase();
           } else {
               result += (c+"").toUpperCase();
           }

        }
        System.out.println((int)'A' + ":"+ (char)(65 + (66-65)) + ":" +(int)'Z'+":" + (int)'a' + ":" +(int)'z');
        return result;
        // 65 + (code-65)
        //97 +
    }
}
