package io.pello.codewars.binarytree.maxdepth;

import io.pello.codewars.binarytree.TreeNode;

public class TreeMaxDepth {
    public int maxDepth(TreeNode root) {
        
        if (root == null){ return 0; }
        
        return Math.max(
            maxDepth(root.getLeft()),
            maxDepth(root.getRight())) + 1;
      }
}
