package io.pello.codewars.countwithoutduplicates;

public class CountWithoutDuplicates {
    public static int count(int[] numbers) {
    
        if (numbers.length == 0) { return 0; }
        
        int j = 0;
        
        for (int i = 1; i < numbers.length; i++) {
          if (numbers[i] != numbers[j]) {
            j++;
            numbers[j] = numbers[i];
          }
        }
        
        j++;
        
        return j;
      }
}
