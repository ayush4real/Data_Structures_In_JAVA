package BinarySearchTree;

import BinaryTrees.BinaryTreeNode;

public class SearchElemInBST {

    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        if(root==null){
            return false;
        }
        if(root.data==k){
            return true;
        }
        if(root.data>=k){
            return searchInBST(root.left,k);
        }else{
            return searchInBST(root.right,k);
        }
    }

    public static void main(String[] args) {

    }
}
