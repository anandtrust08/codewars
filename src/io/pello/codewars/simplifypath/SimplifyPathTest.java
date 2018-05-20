package io.pello.codewars.simplifypath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimplifyPathTest {
    
    private SimplifyPath simplifyPath;

    @BeforeEach
    void setUp() throws Exception {
        simplifyPath = new SimplifyPath();
    }

    @Test
    void testSimplify() {
        assertEquals(simplifyPath.simplify(""),"/");
    }

}
