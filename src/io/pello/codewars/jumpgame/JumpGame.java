package io.pello.codewars.jumpgame;

public class JumpGame {
   public static boolean canJump(int A[]) {
        int last = A.length - 1; 
        
        for (int i = last -1; i >= 0; i--) {
          if (i + A[i] >= last)
            last = i;
        }
        return last <= 0;
      }
}
