package BinarySearchTree;

import BinaryTrees.BinaryTreeNode;

public class IsBSTOptimized_1 {

    public static IsBSTReturn IsBSTOptimized1(BinaryTreeNode<Integer> root){
        if(root==null){
            return new IsBSTReturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
        }

        IsBSTReturn leftIsBST=IsBSTOptimized1(root.left);
        IsBSTReturn rightIsBST=IsBSTOptimized1(root.right);

        int min=Math.min(root.data, Math.min(leftIsBST.min, rightIsBST.min));
        int max=Math.max(root.data, Math.max(leftIsBST.max, rightIsBST.max));
        boolean isBST=true;

        if(leftIsBST.max>=root.data){
            isBST=false;
        }
        if(rightIsBST.min<root.data){
            isBST=false;
        }
        if(!leftIsBST.isBST){
            isBST=false;
        }
        if(!rightIsBST.isBST){
            isBST=false;
        }
        return new IsBSTReturn(min,max,isBST);
    }

    public static void main(String[] args) {

    }
}
