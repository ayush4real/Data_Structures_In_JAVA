package BinaryTrees;

import java.util.ArrayList;

import static BinaryTrees.LevelWiseInputandPrintBinaryTree.takeInputLevelWiseInput;

public class LongestPathFromRootToLeaf {

    public static ArrayList<BinaryTreeNode<Integer>> longestPathToLeaf(BinaryTreeNode<Integer> root){
        if(root==null){
            return new ArrayList<>();
        }
        if(root.left==null && root.right==null){
            ArrayList<BinaryTreeNode<Integer>> list=new ArrayList<>();
            list.add(root);
            return list;
        }
        ArrayList<BinaryTreeNode<Integer>> leftList=longestPathToLeaf(root.left);
        ArrayList<BinaryTreeNode<Integer>> rightList=longestPathToLeaf(root.right);
        leftList=leftList.size()> rightList.size() ? leftList : rightList;
        leftList.add(root);
        return leftList;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=takeInputLevelWiseInput();
        ArrayList<BinaryTreeNode<Integer>> path=longestPathToLeaf(root);
        for(BinaryTreeNode<Integer> node: path){
            System.out.print(node.data+" ");
        }
    }
}
