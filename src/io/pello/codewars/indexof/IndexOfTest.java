package io.pello.codewars.indexof;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IndexOfTest {
    
   private IndexOf indexOf;

    @BeforeEach
    void setUp() throws Exception {
           indexOf = new IndexOf();
    }

    @Test
    void testIndexOf() {
        assertEquals(indexOf.indexOf("asdfneedleasdfadf", "needle"), 4);
        assertEquals(indexOf.indexOf("needleasdfadf", "needle"), 0);
        assertEquals(indexOf.indexOf("neeleasdfadf", "needle"), -1);
    }

}
