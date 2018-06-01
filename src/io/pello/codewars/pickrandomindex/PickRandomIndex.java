package io.pello.codewars.pickrandomindex;

import java.util.Random;

public class PickRandomIndex {
    public int pickRandom(int [] numbers, int target) {
        Random random = new Random();
        int result = -1;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
          if (numbers[i] != target) { continue; }
          count++;
          if (random.nextInt(count) == 0)
            result = i;
        }

        return result;
      }
}
