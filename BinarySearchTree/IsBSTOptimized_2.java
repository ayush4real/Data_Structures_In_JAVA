package BinarySearchTree;

import BinaryTrees.BinaryTreeNode;

public class IsBSTOptimized_2 {

    public static boolean isBSTOptimized2(BinaryTreeNode<Integer> root, int min, int max){
        return isBSTOptimized2Helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static boolean isBSTOptimized2Helper(BinaryTreeNode<Integer> root, int min, int max){
        if(root==null){
            return true;
        }

        if(root.data>max || root.data<min){
            return false;
        }

        return (isBSTOptimized2Helper(root.left,min, root.data-1) &&
                isBSTOptimized2Helper(root.right,root.data,max));
    }

    public static void main(String[] args) {

    }
}
