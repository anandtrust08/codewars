package io.pello.codewars.bitcounting;

import java.util.stream.Collectors;

public class BitCountingClassy {

    public static int countBits(int n) {
        String number =Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i< number.length(); i++)
            if (number.charAt(i) == '1')
                count++;
        
        return count;
    }

}