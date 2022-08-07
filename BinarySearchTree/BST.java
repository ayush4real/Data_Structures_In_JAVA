package BinarySearchTree;

import BinaryTrees.BinaryTreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;

//    static because it is independent of root/ bst we are working on
    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x){
        if(node==null){
            return false;
        }
        if(node.data==x){
            return true;
        }
        if(node.data>x){
            return isPresentHelper(node.left,x);
        }else{
            return isPresentHelper(node.right,x);
        }
    }

    public boolean isPresent(int x){
        return isPresentHelper(root,x);
    }

    public static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x){
        if(node==null){
            BinaryTreeNode<Integer> newRoot=new BinaryTreeNode<>(x);
            return newRoot;
        }

        if(x>= node.data){
            node.right=insertHelper(node.right,x);
        }else{
            node.left=insertHelper(node.left,x);
        }
        return node;
    }

    public void insert(int x){
        root= insertHelper(root,x);
        size++;
    }

    private static int minimum(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int minLeft=minimum(root.left);
        int minRight=minimum(root.right);
        return Math.min(root.data,Math.min(minLeft,minRight));
    }

    private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            return new BSTDeleteReturn(null,false);
        }

        if(root.data<x){
            BSTDeleteReturn outRight=deleteDataHelper(root.right,x);
            root.right=outRight.root;
            outRight.root=root;
            return outRight;
        }
        if(root.data>x){
            BSTDeleteReturn outLeft=deleteDataHelper(root.left,x);
            root.left=outLeft.root;
            outLeft.root=root;
            return outLeft;
        }

//        0 children
        if(root.left==null && root.left==null){
            return new BSTDeleteReturn(null,true);
        }

//        only left child
        if(root.left!=null && root.right==null){
            return new BSTDeleteReturn(root.left,true);
        }

//        only right child
        if(root.left==null && root.right!=null){
            return new BSTDeleteReturn(root.right,true);
        }

//        2 children are present
        int rightMin=minimum(root.right);
        root.data=rightMin;
        BSTDeleteReturn outRight=deleteDataHelper(root.right,rightMin);
        root.right=outRight.root;
        return new BSTDeleteReturn(root,true);
    }

    public boolean deleteData(int x){
        BSTDeleteReturn output=deleteDataHelper(root,x);
        root=output.root;
        if(output.deleted){
            size--;
        }
        return output.deleted;
    }

    public int size(){
        return size;
    }

    private static void printTreeHelper(BinaryTreeNode<Integer> node){
        if(node==null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> remainNodes=new LinkedList<>();
        boolean left=true;
        remainNodes.add(node);
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

    public void printTree(){
        printTreeHelper(root);
    }
}
