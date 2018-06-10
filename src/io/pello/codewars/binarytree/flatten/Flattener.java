package io.pello.codewars.binarytree.flatten;

import io.pello.codewars.binarytree.TreeNode;

public class Flattener {
    private TreeNode processedNode = null;

    public void flatten(TreeNode root) {
      if (root == null) {  return; }
      
      flatten(root.getRight());
      flatten(root.getLeft());

      root.setRight(processedNode);
      root.setLeft(null);

      processedNode = root;
    }
}
