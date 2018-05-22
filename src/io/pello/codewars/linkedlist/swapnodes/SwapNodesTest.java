package io.pello.codewars.linkedlist.swapnodes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.pello.codewars.linkedlist.ListNode;

class SwapNodesTest {
    private SwapNodes swapNodes;
    private ListNode listNode;
    
    @BeforeEach
    void setUp() throws Exception {
        swapNodes = new SwapNodes();
        listNode = new ListNode(42, new ListNode(666, new ListNode(15, new ListNode(3,null))));
    }

    @Test
    void testSwapPairs() {
       assertEquals(swapNodes.swapPairs(listNode).toString(), "666->42->3->15");
    }

}
