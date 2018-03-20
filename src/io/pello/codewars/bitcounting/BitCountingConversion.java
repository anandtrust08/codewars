package io.pello.codewars.bitcounting;

import java.util.stream.Collectors;

public class BitCountingConversion {

    public static int countBits(int n) {
        int count = 0;

        while(n>1) {
            if (n % 2 != 0) count++;
            n = n/2;
        } 
        return count + n;
    }

}