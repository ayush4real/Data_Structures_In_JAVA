package BinarySearchTree;

import BinaryTrees.BinaryTreeNode;

public class IsTreeBST {

    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }
        if(root.left!=null && maxVal(root.left)>=root.data){
            return false;
        }
        if(root.right!=null && minVal(root.right)<root.data){
            return false;
        }
        return (isBST(root.left) && isBST(root.right));
    }

    public static int maxVal(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maxVal(root.left),maxVal(root.right)));
    }


    public static int minVal(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,Math.min(minVal(root.left),minVal(root.right)));
    }

    public static void main(String[] args) {

    }
}
