package io.pello.codewars.antistring;

public class AntiString {
    public static String antiString(String str){
        String result = "";
        for (int i = 0; i< str.length();i++) {
            char c = str.charAt(i);
            
           if ((int)c >= 65 && (int)c<=90) {
               c = (char)(65 + (90- (int)c));
               result = (c+"").toLowerCase() + result;
           } 
           else if((int)c >= 97 && (int)c<=122)  {
               c = (char)(97 + (122-(int)c));
               result = (c+"").toUpperCase() + result;
           } else if ((int)c >= 48 && (int)c<=57) {
               System.out.println("Number!! : " + (int)c + ": " +(char)(48 + ((int)c-48)));
               result = (char)(48 + (57 - (int)c)) + result;
           }
        }
        
        System.out.println((int)'A' + ":"+ (char)(65 + (66-65)) + ":" +(int)'Z'+":" + (int)'0' + ":" +(int)'9');
        return result;
        // 65 + (97-code)
        //97 +
    }
}
