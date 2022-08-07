package BinaryTrees;

import java.util.Scanner;

public class MirrorBinaryTree {

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        BinaryTreeNode<Integer> node=root.left;
        root.left=root.right;
        root.right=node;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
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

    public static void preOrderTravPrint(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+": ");
        if(root.left!=null){
            System.out.print("L-"+root.left.data+", ");
        }else{
            System.out.print("L-null, ");
        }

        if(root.right!=null){
            System.out.print("R-"+root.right.data);
        }else{
            System.out.print("R-null");
        }
        System.out.println();
        preOrderTravPrint(root.left);
        preOrderTravPrint(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=takeInputBetter(true,0,true);
        preOrderTravPrint(root);
        mirrorBinaryTree(root);
        preOrderTravPrint(root);
    }
}
