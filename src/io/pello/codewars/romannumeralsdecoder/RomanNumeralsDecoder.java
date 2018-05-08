package io.pello.codewars.romannumeralsdecoder;

public class RomanNumeralsDecoder {
    public int solution(String s) {
        int number = 0;
        if (s.indexOf("IV") != -1) {
            number -= 2;
        }
        if (s.indexOf("IX") != -1) {
            number -= 2;
        }
        if (s.indexOf("XL") != -1) {
            number -= 20;
        }
        if (s.indexOf("XC") != -1) {
            number -= 20;
        }
        if (s.indexOf("CD") != -1) {
            number -= 200;
        }
        if (s.indexOf("CM") != -1) {
            number -= 200;
        }

        char c[] = s.toCharArray();

        for (int i = 0; i <= s.length() - 1; i++) {
            switch (c[i]) {
            case 'M':
                number += 1000;
                break;
            case 'D':
                number += 500;
                break;
            case 'C':
                number += 100;
                break;
            case 'L':
                number += 50;
                break;
            case 'X':
                number += 10;
                break;
            case 'V':
                number += 5;
                break;
            case 'I':
                number += 1;
                break;
            default:
                break;
            }
        }

        return number;
    }
}
