package io.pello.codewars.paginationhelper;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class PaginationHelperSuperTest {

    PaginationHelper<Character> paginationHelper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);

    @Test
    public void testItemCount() {
        assertEquals(6, paginationHelper.itemCount());
    }
    
    @Test
    public void pageCountTest() {
        assertEquals(2, paginationHelper.pageCount());
    }

    @Test
    public void pageItemCountTest() {
        assertEquals(-1, paginationHelper.pageItemCount(-1));
        assertEquals(-1, paginationHelper.pageItemCount(2));
        assertEquals(-1, paginationHelper.pageItemCount(4));
        assertEquals(2, paginationHelper.pageItemCount(1));
        assertEquals(4, paginationHelper.pageItemCount(0));
    }

    @Test
    public void pageIndexTest() {
        assertEquals(0, paginationHelper.pageIndex(3));
        assertEquals(1, paginationHelper.pageIndex(4));
        assertEquals(1, paginationHelper.pageIndex(5));
        assertEquals(-1, paginationHelper.pageIndex(20));
        assertEquals(-1, paginationHelper.pageIndex(-20));
        }

    @Test
    public void pageNull() {
        paginationHelper = new PaginationHelper(Arrays.asList(), 4);;
        assertEquals(0, paginationHelper.itemCount());
        assertEquals(0, paginationHelper.pageCount());
        assertEquals(-1, paginationHelper.pageItemCount(20));
        assertEquals(-1, paginationHelper.pageIndex(-20));
        }
}
