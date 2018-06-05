package io.pello.codewars.reversepolishnotation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReversePolishNotationTest {
    
    private ReversePolishNotation reversePolishNotation;

    @BeforeEach
    void setUp() throws Exception {
        reversePolishNotation = new ReversePolishNotation();
    }

    @Test
    void testEval() {
        String[] expr = new String[] {"0","0","+"};
        assertEquals(reversePolishNotation.eval(expr),0);
        
        expr = new String[] {"2", "1", "+", "3", "*"};
        assertEquals(reversePolishNotation.eval(expr),9);
        
        expr = new String[] {"4", "13", "5", "/", "+"};
        assertEquals(reversePolishNotation.eval(expr),6);
    }

}
