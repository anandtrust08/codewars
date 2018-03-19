package io.pello.codewars.bitcounting;

import java.util.stream.Collectors;

public class BitCounting {

    public static int countBits(int n) {
        System.out.println(Integer.toBinaryString(n));
        return  Integer.toBinaryString(n)
            .chars()
            .mapToObj(i -> (char) i-'0')
            .mapToInt(Integer::intValue).sum();

    }

}