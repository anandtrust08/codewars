package io.pello.codewars.gasstation;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      
      int start = 0;
      int total = 0;
      int tank = 0;

      for (int i = 0; i < gas.length; i++)
        if ((tank = tank + gas[i] - cost[i]) < 0) {
          start = i + 1;
          total += tank;
          tank = 0;
        }
      
      return (total + tank < 0) ? -1 : start;
    }
}
