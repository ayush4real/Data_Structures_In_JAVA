package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintLevelOrder {
    static int count=1;

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

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }

        Queue<BinaryTreeNode<Integer>> remNodes=new LinkedList<>();
        remNodes.add(root);
        remNodes.add(null);
        while(!remNodes.isEmpty()){
            BinaryTreeNode<Integer> front=remNodes.remove();
            if(front!=null){
                System.out.print(front.data+" ");
                if(front.left!=null){
                    remNodes.add(front.left);
                }
                if(front.right!=null){
                    remNodes.add(front.right);
                }
            }else{
                System.out.println();
                if(!remNodes.isEmpty()){
                    remNodes.add(null);
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=takeInputLevelWiseInput();
        printLevelWise(root);
    }
}
