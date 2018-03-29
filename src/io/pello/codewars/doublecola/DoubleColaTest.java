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
      System.out.println("test2-------------------------------");
      assertEquals("Sheldon", new DoubleCola().WhoIsNext(names, n));
    }
   
   
   @Test
   public void test27() {
     String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
     int n = 7;  
     System.out.println("test27-------------------------------");
     assertEquals("Leonard", new DoubleCola().WhoIsNext(names, n));
   }
   
   @Test
   public void tes28() {
     String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
     int n = 8;  
     System.out.println("test28-------------------------------");
     assertEquals("Leonard", new DoubleCola().WhoIsNext(names, n));
   }
   
   @Test
   public void test29() {
     String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
     int n = 9;  
     System.out.println("test29-------------------------------");
     assertEquals("Penny", new DoubleCola().WhoIsNext(names, n));
   }
   
   @Test
   public void test210() {
     String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
     int n = 10;  
     System.out.println("test210-------------------------------");
     assertEquals("Penny", new DoubleCola().WhoIsNext(names, n));
   }
   
   @Test
   public void test211() {
     String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
     int n = 11;  
     System.out.println("test211-------------------------------");
     assertEquals("Rajesh", new DoubleCola().WhoIsNext(names, n));
   }

   @Test
   public void test3() {
     String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
     int n = 12;  
     System.out.println("test3-------------------------------");
     assertEquals("Rajesh", new DoubleCola().WhoIsNext(names, n));
   }
   
   @Test
   public void test4() {
     String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
     int n = 22;  
     System.out.println("test4-------------------------------");
     assertEquals("Leonard", new DoubleCola().WhoIsNext(names, n));
   }
   
   @Test
   public void test5() {
     String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
     int n = 54;  
     System.out.println("test5-------------------------------");
     assertEquals("Penny", new DoubleCola().WhoIsNext(names, n));
   }
   
   @Test
   public void test6() {
     String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
     int n = 95;  
     System.out.println("test6-------------------------------");
     assertEquals("Leonard", new DoubleCola().WhoIsNext(names, n));
   }
}
