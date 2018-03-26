package io.pello.codewars.camelcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CamelCaseTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
      String input = "the_Stealth_Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", CamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
      String input = "the-Stealth-Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", CamelCase.toCamelCase(input));
    }
    
    @Test
    public void testOther() {
      String input = "river_south_down_Wall";
      System.out.println("input: "+input);      
      assertEquals("riverSouthDownWall", CamelCase.toCamelCase(input));
    }
    
    
}
