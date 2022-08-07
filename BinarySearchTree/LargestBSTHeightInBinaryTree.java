package BinarySearchTree;

import BinaryTrees.BinaryTreeNode;

public class LargestBSTHeightInBinaryTree {

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        return largestBSTSubtreeHelper(root).height;
    }

    public static MaxBSTHeightReturn largestBSTSubtreeHelper(BinaryTreeNode<Integer> root) {
        if(root==null){
            return new MaxBSTHeightReturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true,0);
        }

        MaxBSTHeightReturn left=largestBSTSubtreeHelper(root.left);
        MaxBSTHeightReturn right=largestBSTSubtreeHelper(root.right);
        if(left.isBST && right.isBST && root.data>left.max && root.data<=right.min){
                return new MaxBSTHeightReturn(Math.min(root.data,Math.min(left.min, right.min)),
                        Math.max(root.data,Math.max(left.max, right.max)),
                        true, 1+Math.max(left.height, right.height));
        }else{
            return new MaxBSTHeightReturn(
                    Math.min(root.data,Math.min(left.min, right.min)),
                    Math.max(root.data,Math.max(left.max, right.max)),
                    false,
                    Math.max(left.height, right.height)
            );
        }
    }

    public static void main(String[] args) {

    }
}
