package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelWiseInputandPrintBinaryTree {

    public static BinaryTreeNode<Integer> takeInputLevelWiseInput(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter root data:");
        int rootData= s.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren= new LinkedList<>();
        pendingChildren.add(root);
        while (!pendingChildren.isEmpty()){
            BinaryTreeNode<Integer> front=pendingChildren.remove();
            System.out.println("Enter left child for "+front.data);
            int left=s.nextInt();
            if(left!=-1){
                BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<>(left);
                front.left=leftChild;
                pendingChildren.add(leftChild);
            }
            System.out.println("Enter right child for "+front.data);
            int right=s.nextInt();
            if(right!=-1){
                BinaryTreeNode<Integer> rightChild=new BinaryTreeNode<>(right);
                front.right=rightChild;
                pendingChildren.add(rightChild);
            }
        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> remainNodes=new LinkedList<>();
        boolean left=true;
        remainNodes.add(root);
        while(!remainNodes.isEmpty()){
            BinaryTreeNode<Integer> front=remainNodes.remove();
            if(front.data!=-1){
                System.out.print(front.data+":");
                int val=front.left==null? -1:front.left.data;
                System.out.print("L:"+val+":,");

                val=front.right==null?-1:front.right.data;
                System.out.print("R:"+val);
                System.out.println();

                if(front.left==null && front.data!=-1){
                    remainNodes.add(new BinaryTreeNode<>(-1));
                }
                if(front.left!=null){
                    remainNodes.add(front.left);
                }
                if(front.right==null && front.data!=-1){
                    remainNodes.add(new BinaryTreeNode<>(-1));
                }
                if(front.right!=null){
                    remainNodes.add(front.right);
                }
            }
        }
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
        BinaryTreeNode<Integer> root=takeInputLevelWiseInput();
        printLevelWise(root);
    }
}
