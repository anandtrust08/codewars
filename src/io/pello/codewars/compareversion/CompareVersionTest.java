package io.pello.codewars.compareversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompareVersionTest {
    private CompareVersion compareVersion;
    
    @BeforeEach
    void setUp() throws Exception {
        compareVersion = new CompareVersion();
    }

    @Test
    void testCompare() {
       assertEquals(compareVersion.compare("0", "1"),-1);
       assertEquals(compareVersion.compare("1", "0"),1);
       assertEquals(compareVersion.compare("1.12.5", "1.2.5"),1);
       assertEquals(compareVersion.compare("1.12.5", "1.02.5"),1);
       assertEquals(compareVersion.compare("1.12.5", "2.20.5"),-1);
    }

}
