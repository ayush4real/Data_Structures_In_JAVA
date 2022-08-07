package BinaryTrees;

import java.util.Scanner;

public class MaxValueOfBinaryTreeNode {

    public static int maxNodeValInBT(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int max1=maxNodeValInBT(root.left);
        int max2=maxNodeValInBT(root.right);
        max1=Math.max(max1,root.data);
        max2=Math.max(max1,max2);
        return max2;
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
        System.out.println(maxNodeValInBT(root));
    }
}
