package io.pello.codewars.countonebits;

public class CountOneBits {
    public int count(int number) {
        
        int ones = 0;
        
        while (number != 0) {
          ones = ones + (number & 1);
          number = number >>> 1;
        }
        
        return ones;
      }
}
