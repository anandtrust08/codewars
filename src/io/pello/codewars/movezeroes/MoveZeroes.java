package io.pello.codewars.movezeroes;

public class MoveZeroes {
    public int[] moveZeroes(int[] numbers) {
        
        if (numbers == null || numbers.length == 0) {  return numbers; }

        int insertPos = 0;
        
        for (int i=0;i<numbers.length;i++) {
          if (numbers[i] != 0) {
            numbers[insertPos++] = numbers[i];
          }
        }

        while (insertPos < numbers.length) {
          numbers[insertPos++] = 0;
        }
        
        return numbers;
      }
}
