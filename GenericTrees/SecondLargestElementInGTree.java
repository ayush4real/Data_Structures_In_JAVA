package GenericTrees;

import Arrays.SecondLargest;

public class SecondLargestElementInGTree {

    public static GTreeNode<Integer> findSecondLargest(GTreeNode<Integer> root){
        if(root==null){
            return null;
        }
        return findSecondLargestHelper(root,new SecondLargestReturn()).max2;
    }

    public static SecondLargestReturn findSecondLargestHelper(GTreeNode<Integer> root, SecondLargestReturn largest){
        if(largest.max1==null){
            largest.max1=root;
            // largest.max2=root;
        }
        if(root.data>largest.max1.data){
            largest.max2=largest.max1;
            largest.max1=root;
        }else if(root.data<largest.max1.data && (largest.max2==null || largest.max2.data<root.data)){
            largest.max2=root;
        }
        for(GTreeNode<Integer> node: root.children){
            largest=findSecondLargestHelper(node,largest);
        }
        return largest;
    }

    public static void main(String[] args) {

    }
}
