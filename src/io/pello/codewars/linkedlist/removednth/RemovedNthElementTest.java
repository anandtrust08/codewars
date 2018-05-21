package io.pello.codewars.linkedlist.removednth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemovedNthElementTest {
    
    private ListNode listNode;
    private RemovedNthElement removedNthElement;
    
    @BeforeEach
    void setUp() throws Exception {
        removedNthElement = new RemovedNthElement();
        listNode = new ListNode(42, new ListNode(666, new ListNode(15, new ListNode(3,null))));
    }

    @Test
    void testRemoveNthFromEnd() {
       assertEquals(removedNthElement.removeNthFromEnd(listNode,2).toString(),"42->666->3");
    }

    @Test
    void testRemoveNthFromEnd2() {
       assertEquals(removedNthElement.removeNthFromEnd(listNode,3).toString(),"42->15->3");
    }
}
