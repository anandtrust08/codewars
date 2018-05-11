package io.pello.codewars.reverseinteger;

public class ReverseInteger {
    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            reversed = (reversed * 10) + (number % 10);
            number /= 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        } else {
            return reversed;
        }
    }
}
