package io.pello.codewars.trailingzeroes;

public class TrailingZeroes {
    public static int zeros(int n) {

        int divider = 5;
        int total = 0;

        while (n / divider > 0) {
            total = total + (n / divider);
            divider = divider * 5;
        }

        return total;
    }
}
