package io.pello.codewars.doublecola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoubleColaTest {
    @Test
    public void test1() {
      String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
      int n = 1;  
      assertEquals("Sheldon", new DoubleCola().WhoIsNext(names, n));
    }
   @Test
    public void test2() {
      String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
      int n = 6;  
      assertEquals("Sheldon", new DoubleCola().WhoIsNext(names, n));
    }

}
