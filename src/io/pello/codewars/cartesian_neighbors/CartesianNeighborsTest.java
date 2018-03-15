package io.pello.codewars.cartesian_neighbors;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

class CartesianNeighborsTest {

    @Test
    void testCartesianNeighbor() {
        
        assertArrayEquals( 
          CartesianNeighbors.cartesianNeighbor(2, 2), 
          new int[][]{{1,1},{1,2},{1,3},{2,1},{2,3},{3,1},{3,2},{3,3}}
        );
    }

}
