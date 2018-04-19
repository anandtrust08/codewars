package io.pello.codewars.romannumeralsencoder;

public class RomanNumeralsEncoder {
    private static final String[][] conversion = new String[][] {
        {"I","II","III","IV","V","VI","VII","VIII","IX"},
        {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
        {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
        {"M","MM","MMM","ML","L","LM","LMM","LMMM","XM"}};
                                                
                                                    
    public String solution(int n) {
        if (n <= 0) return "";
        String number = n+"";
        String result = "";
        
        for (int i=0;i<number.length();i++)
            result += getNumber(number.charAt(i)+"", number.length()-i);
            
        return result;
    }
    
    public static String getNumber (String number, int size) {
        if (number.equals("0")) return "";
        System.out.println(number +" and " + size +": " + (Integer.parseInt(number)-1) +", " + (size-1));
        return conversion[size-1][(Integer.parseInt(number)-1)];
    }
}
