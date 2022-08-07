package BinarySearchTree;

import BinaryTrees.BinaryTreeNode;

public class ReplaceValWithSumOfGreaterNodes {

    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        SumReturn<Integer> pair=new SumReturn<>();
        NodesSumHelper(root, pair);
    }

    public static SumReturn<Integer> NodesSumHelper(BinaryTreeNode<Integer> root, SumReturn<Integer> pair){
        if(root==null){
            return pair;
        }
        SumReturn<Integer> res1=NodesSumHelper(root.right,pair);
        if(res1.node==null){
            res1.node=new BinaryTreeNode<>(root.data);
            res1.sum=root.data;
        } else if(res1.node!=null && res1.node.data>=root.data){
            res1.node=new BinaryTreeNode<>(root.data);
            root.data+=res1.sum;
            res1.sum= root.data;
        }
        SumReturn<Integer> res2=NodesSumHelper(root.left,res1);
        return res2;
    }

    public static void main(String[] args) {

    }
}
