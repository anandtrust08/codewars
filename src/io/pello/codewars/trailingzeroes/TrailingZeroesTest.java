package io.pello.codewars.trailingzeroes;
//import org.junit.Test;
//import static org.hamcrest.CoreMatchers.*;
//import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrailingZeroesTest {
    
    @Test
    public void testZeros() throws Exception {
         assertEquals(0,TrailingZeroes.zeros(0));
         assertEquals(1,TrailingZeroes.zeros(6));
         assertEquals(2,TrailingZeroes.zeros(14));
         assertEquals(3,TrailingZeroes.zeros(15));
         assertEquals(4,TrailingZeroes.zeros(20));
         assertEquals(4,TrailingZeroes.zeros(24));
         assertEquals(6,TrailingZeroes.zeros(25));
         assertEquals(6,TrailingZeroes.zeros(29));
         assertEquals(7,TrailingZeroes.zeros(30));
//      assertThat(TrailingZeroes.zeros(0), is(0)); 
//      assertThat(TrailingZeroes.zeros(6), is(1)); 
//      assertThat(TrailingZeroes.zeros(14), is(2));    
    }

}
