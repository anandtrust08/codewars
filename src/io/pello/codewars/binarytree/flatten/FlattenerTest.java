package io.pello.codewars.binarytree.flatten;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.pello.codewars.binarytree.TreeNode;
import io.pello.codewars.binarytree.inordertraversal.InorderTraversal;

class FlattenerTest {
    private Flattener flattener;
    private TreeNode treeNode;

    @BeforeEach
    void setUp() throws Exception {
        flattener = new Flattener();
        treeNode = new TreeNode();
        for (int i = 1;i<7;i++)
            treeNode.addNode(i);
    }

    @Test
    void testFlatten() {
        flattener.flatten(treeNode);
        
        for (int i=1; i< 7; i++) { // Should be:  1,2,3,4,5,6
            assertEquals(treeNode.getValue(),i);
            treeNode = treeNode.getRight();
        }
    }

}
