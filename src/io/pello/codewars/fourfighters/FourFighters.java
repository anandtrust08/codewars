package io.pello.codewars.fourfighters;
import java.util.Arrays;
public class FourFighters {
	 public static int shortestTime(int[] speed) {
	        Arrays.sort(speed);
	         return Math.min((speed[0]*2) + speed[1] + speed[2] + speed[3],
	                         Math.min(Math.max(speed[3],speed[2]) + Math.max(speed[1], speed[0]) + (speed[1]*3),
	                                  Math.max(speed[3],speed[2]) + Math.min(speed[1], speed[0]) + (speed[1]*3)
	                         )
	                );
	  }
}
