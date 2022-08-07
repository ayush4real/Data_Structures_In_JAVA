package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PathSumFromRootToLeafNode {

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

    public static void pathSumRootToLeaf(BinaryTreeNode<Integer> root,int k){
        if(root==null){
            return;
        }
        pathSumRootToLeafHelper(root,k,"");
    }

    public static void pathSumRootToLeafHelper(BinaryTreeNode<Integer> root,int k,String s){
        String d= String.valueOf(root.data);
        if(root.data==k && root.left==null && root.right==null){
            System.out.println(s+" "+d);
            return;
        }
        if(root.data!=k && root.left!=null){
            pathSumRootToLeafHelper(root.left,k-root.data,s+" "+d);
        }
        if(root.data!=null && root.right!=null){
            pathSumRootToLeafHelper(root.right,k-root.data,s+" "+d);
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=takeInputLevelWiseInput();
        pathSumRootToLeaf(root, 13);
    }
}
