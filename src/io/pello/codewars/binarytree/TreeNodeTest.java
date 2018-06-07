package io.pello.codewars.binarytree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeNodeTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void testTreeNodeInt() {
       TreeNode treeNode = new TreeNode(42);
       assertEquals(treeNode.getValue(), 42);
       assertNull(treeNode.getRight());
       assertNull(treeNode.getLeft());   
    }

    @Test
    void testTreeNodeIntTreeNodeTreeNode() {
        TreeNode treeNode = new TreeNode(42);
        treeNode.addNode(15);
        treeNode.addNode(666);
        assertEquals(treeNode.getValue(), 42);
        assertEquals(treeNode.getRight().getValue(), 15);
        assertNull(treeNode.getRight().getRight());
        assertNull(treeNode.getLeft().getLeft()); 
    }

}
