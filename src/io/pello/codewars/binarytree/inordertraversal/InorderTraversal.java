package io.pello.codewars.binarytree.inordertraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import io.pello.codewars.binarytree.TreeNode;

public class InorderTraversal {
    public List<Integer> traverse(TreeNode root) {

      List<Integer> list = new ArrayList<Integer>();
      Stack<TreeNode> stack = new Stack<TreeNode>();

      while (root != null || !stack.isEmpty()) {

        if (root != null) {
          stack.push(root);
          root = root.getLeft();
          continue;
        }

        root = stack.pop();
        list.add(root.getValue());

        root = root.getRight();
      }
      return list;
    }
}
