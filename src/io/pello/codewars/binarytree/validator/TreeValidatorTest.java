package io.pello.codewars.binarytree.validator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.pello.codewars.binarytree.TreeNode;

class TreeValidatorTest {

    private TreeValidator treeValidator;
    private TreeNode treeNode;
    
    @BeforeEach
    void setUp() throws Exception {
        treeValidator = new TreeValidator();
        treeNode = new TreeNode(42);
        assertEquals(treeNode.getValue(), 42);
        assertNull(treeNode.getRight());
        assertNull(treeNode.getLeft()); 
    }

    @Test
    void testNullIsValid() {
        assertTrue(treeValidator.isValid(null));
    }

    @Test
    void testIsValid() {
        assertTrue(treeValidator.isValid(treeNode));
    }
    
    @Test
    void testBiggerIsValid() {
        treeNode = new TreeNode(42);
        treeNode.addNode(15);
        treeNode.addNode(666);
        treeNode.addNode(668);
        treeNode.addNode(6);

        
        assertTrue(treeValidator.isValid(treeNode));
    }
}
