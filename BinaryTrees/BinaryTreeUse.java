package BinaryTrees;

import ArraynLinkedLists.Node;

import java.util.Scanner;

public class BinaryTreeUse {

    public static void printBinaryTree(BinaryTreeNode<Integer> root){
        // TODO base case
        if(root==null){
            return;
        }
        System.out.print(root.data+": ");
        if(root.left!=null){
            System.out.print("L "+root.left.data+" ,");
        }else {
            System.out.print("L null ,");
        }
        if(root.right!=null){
            System.out.print("R "+root.right.data);
        }else{
            System.out.print("R null");
        }
        System.out.println();
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }

    public static BinaryTreeNode<Integer> takeInput(){
        System.out.println("Enter root node data");
        Scanner s=new Scanner(System.in);
        int rootData=s.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> rootNode=new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild=takeInput();
        BinaryTreeNode<Integer> rightChild=takeInput();
        rootNode.left=leftChild;
        rootNode.right=rightChild;
        return rootNode;
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
//        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> rootLeft=new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> rootRight=new BinaryTreeNode<>(3);
//        root.left=rootLeft;
//        root.right=rootRight;
//        BinaryTreeNode<Integer> twoRight=new BinaryTreeNode<>(4);
//        BinaryTreeNode<Integer> threeLeft=new BinaryTreeNode<>(5);
//        rootLeft.right=twoRight;
//        rootRight.left=threeLeft;
        BinaryTreeNode<Integer> root=takeInputBetter(true,0,true);
        printBinaryTree(root);
    }
}
