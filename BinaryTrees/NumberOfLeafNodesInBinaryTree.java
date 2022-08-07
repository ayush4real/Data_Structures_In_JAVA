package BinaryTrees;

import java.util.Scanner;

public class NumberOfLeafNodesInBinaryTree {

    public static int leafNodesCount(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int lH=leafNodesCount(root.left);
        int rH=leafNodesCount(root.right);
        if(lH==0 && rH==0){
            return 1;
        }
        return lH+rH;
    }

    public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot,int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root node");
        }else{
            if(isLeft){
                System.out.println("Enter left node for "+parentData);
            }else{
                System.out.println("Enter right node for "+parentData);
            }
        }
        Scanner s=new Scanner(System.in);
        int rootData=s.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> rootNode=new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild=takeInputBetter(false,rootData,true);
        BinaryTreeNode<Integer> rightChild=takeInputBetter(false,rootData,false);
        rootNode.left=leftChild;
        rootNode.right=rightChild;
        return rootNode;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=takeInputBetter(true,0,true);
        System.out.println(leafNodesCount(root));
    }
}
