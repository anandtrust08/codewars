package io.pello.codewars.binarytree.maxdepth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.pello.codewars.binarytree.TreeNode;

class TreeMaxDepthTest {

    private TreeMaxDepth treeMaxDepth;
    private TreeNode treeNode;
    
    @BeforeEach
    void setUp() throws Exception {
        treeMaxDepth = new TreeMaxDepth();
        treeNode = new TreeNode(42);
        assertEquals(treeNode.getValue(), 42);
        assertNull(treeNode.getRight());
        assertNull(treeNode.getLeft()); 
    }

    @Test
    void testNullsDepth() {
        assertEquals(treeMaxDepth.maxDepth(null), 0);
    }

    @Test
    void testDepth() {
        assertEquals(treeMaxDepth.maxDepth(treeNode), 1);
    }
    
    @Test
    void testBiggerDepth() {
        treeNode = new TreeNode(42);
        treeNode.addNode(15);
        treeNode.addNode(666);
        treeNode.addNode(668);
        treeNode.addNode(6);

        
        assertEquals(treeMaxDepth.maxDepth(treeNode),3 );
    }
}
