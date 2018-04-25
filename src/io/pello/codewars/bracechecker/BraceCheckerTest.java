package io.pello.codewars.bracechecker;

import static org.junit.Assert.*;
import org.junit.Test;

public class BraceCheckerTest {

    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid1() {
        assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testValid2() {
        assertEquals(true, checker.isValid("(){}[]"));
    }
    
    @Test
    public void testValid3() {
        assertEquals(true, checker.isValid("([{}])"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));
    }

}
