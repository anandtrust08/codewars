package io.pello.codewars.binarytree.inordertraversal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.pello.codewars.binarytree.TreeNode;

class InorderTraversalTest {
    
    private InorderTraversal inorderTraversal;
    private TreeNode treeNode;

    @BeforeEach
    void setUp() throws Exception {
        inorderTraversal = new InorderTraversal();
        treeNode = new TreeNode(42);
        assertEquals(treeNode.getValue(), 42);
        assertNull(treeNode.getRight());
        assertNull(treeNode.getLeft()); 
    }
    
    @Test
    void testInorderTraversal() {
        assertEquals(inorderTraversal.traverse(treeNode).toString(),"[42]");
    }

    @Test
    void testBiggerIsValid() {
        treeNode = new TreeNode(42);
        treeNode.addNode(15);
        treeNode.addNode(666);
        treeNode.addNode(668);
        treeNode.addNode(6);

        
        assertEquals(inorderTraversal.traverse(treeNode).toString(),"[6, 15, 42, 666, 668]");
    }
}
