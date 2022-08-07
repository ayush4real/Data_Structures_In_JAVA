package BinaryTrees;

import java.util.Scanner;

public class InOrderTraversal {

    public static void inOrderTravPrint(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        inOrderTravPrint(root.left);
        if(root.left!=null){
            System.out.print("L-"+root.left.data);
        }else{
            System.out.print("L-null");
        }
        System.out.print(" :"+root.data+": ");
        inOrderTravPrint(root.right);
        if(root.right!=null){
            System.out.print("R-"+root.right.data);
        }else{
            System.out.print("R-null");
        }
        System.out.println();
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
        inOrderTravPrint(root);
    }
}
