package io.pello.codewars.binarytree.validator;

import io.pello.codewars.binarytree.TreeNode;

public class TreeValidator {
    private long prevVal = (long) Integer.MIN_VALUE - 1;

    public boolean isValid(TreeNode root) {

        if (root == null) {  return true; }

        if (!isValid(root.getLeft())) {  return false; }

        if (!(prevVal < root.getValue())) {  return false; }

        prevVal = root.getValue();

        return isValid(root.getRight());
    }
}
