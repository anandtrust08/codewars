package io.pello.codewars.dirreduction;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DirReductionTest {
    @Test
    public void testSimpleDirReduc() throws Exception {
        assertArrayEquals(new String[] { "WEST" }, DirReduction.dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" }));

       assertArrayEquals(new String[] { "NORTH", "WEST", "SOUTH", "EAST" }, DirReduction.dirReduc(new String[] { "NORTH", "WEST", "SOUTH", "EAST" }));
    }
}
