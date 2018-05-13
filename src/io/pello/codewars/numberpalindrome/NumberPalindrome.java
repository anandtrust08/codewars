package io.pello.codewars.numberpalindrome;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

        if (number < 10) { return false; }

        int reversed = 0;
        
        while (number > reversed) {
          reversed = reversed * 10 + number % 10;
          number = number / 10;
        }
        
        System.out.println(number + " : " + reversed + ". " + (reversed /10));
        return (number == reversed || number == reversed / 10);
      }
}
