package io.pello.codewars.binarytree;

public class TreeNode {
    private Integer value;
    private TreeNode left;
    private TreeNode right;
   
    public TreeNode() { 
        value = null;
        right = null;
        left = null;
    }
   
    public TreeNode(Integer value) { 
        this.value = value;
        right = null;
        left = null;
    }
   
    
    public void addNode (int value) {
        if (null == this.value) {
            this.value = value;
        } else if (value < this.value) {
            if (null == this.getLeft()) {
                this.setLeft(new TreeNode(value));
            } else {
                this.getLeft().addNode(value);
            }
        } else {
            if (null == this.getRight()) {
                this.setRight(new TreeNode(value));
            } else {
                this.getRight().addNode(value);
            }
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
    
    
}
