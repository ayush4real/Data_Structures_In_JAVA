package BinarySearchTree;

import BinaryTrees.BinaryTreeNode;

public class SortedArrayIntoBST {

    public static BinaryTreeNode<Integer> arrayToBST(int[] arr){
        return arrayToBSTHelper(arr,0, arr.length-1);
    }

    public static BinaryTreeNode<Integer> arrayToBSTHelper(int[] arr, int s,int e){
        if(s>e){
            return null;
        }
        if (s==e){
            return new BinaryTreeNode<>(arr[s]);
        }
        int mid=(s+e)/2;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[mid]);
        root.left=arrayToBSTHelper(arr,s,mid-1);
        root.right=arrayToBSTHelper(arr,mid+1,e);
        return root;
    }

    public static void main(String[] args) {

    }
}
