package io.pello.codewars.singlenumber;

public class SingleNumber {
    int singleNumber(int numbers[]) {
        int difference = 0;
        for (int i = 0; i < numbers.length; i++) {
            difference ^= numbers[i];
        }
        return difference;
    }
}
