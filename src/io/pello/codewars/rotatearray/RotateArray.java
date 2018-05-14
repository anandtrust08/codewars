package io.pello.codewars.rotatearray;

import java.util.Arrays;

public class RotateArray {
    public int[] rotate(int[] numbers, int steps) {
        
        if (steps < 1) { return numbers; }
        
        steps = steps % numbers.length;
        reverse(numbers, 0, numbers.length - 1);
        reverse(numbers, 0, steps - 1);
        reverse(numbers, steps, numbers.length - 1);

        return numbers;
    }

    private void reverse(int[] numbers, int start, int end) {
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            end--;
            start++;
        }
    }
}
