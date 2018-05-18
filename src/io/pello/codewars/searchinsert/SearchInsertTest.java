package io.pello.codewars.searchinsert;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SearchInsertTest {
    private SearchInsert searchInsert;
    
    @BeforeEach
    void setUp() throws Exception {
        searchInsert = new SearchInsert();
    }

    @Test
    void testSearchInsertPosition() {
       assertEquals(searchInsert.searchInsertPosition(new int[] {1,2,3,4,5,6,7,8}, 4), 3);
       assertEquals(searchInsert.searchInsertPosition(new int[] {1,2,3,4,5,6,7,8}, 1), 0);
    }

}
