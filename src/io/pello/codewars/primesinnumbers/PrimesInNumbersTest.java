package io.pello.codewars.primesinnumbers;
import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimesInNumbersTest {
    @Test
    public void testPrimeDecompOne() {
        int lst = 7775460;        
        assertEquals(
            "(2**2)(3**3)(5)(7)(11**2)(17)",
            PrimesInNumbers.factors(lst));
    }
}