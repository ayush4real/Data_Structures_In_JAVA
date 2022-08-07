package BinaryTrees;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BTreeUsingInorderAndPreorder {

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        BinaryTreeNode<Integer> root=buildTreeHelper(preOrder,inOrder,0, preOrder.length-1,
                0, inOrder.length-1 );
        return root;
    }

    public static BinaryTreeNode<Integer> buildTreeHelper(int[] preOrder, int[] inOrder,int sPre,
                                                          int ePre,int sIn,int eIn){
        if(sPre>ePre){
            return null;
        }

        int rootData=preOrder[sPre];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        int index=-1;
        for(int i=sIn;i<=eIn;i++){
            if(inOrder[i]==rootData){
                index=i;
                break;
            }
        }
        int sPreLeft=sPre+1;
        int sInLeft=sIn;
        int eInLeft=index-1;
        int ePreRight=ePre;
        int sInRight=index+1;
        int eInRight=eIn;

        int leftSubTreeLen=eInLeft-sInLeft+1;
        int ePreLeft=sPreLeft+leftSubTreeLen-1;
        int sPreRight=ePreLeft+1;

        BinaryTreeNode<Integer> left=buildTreeHelper(preOrder,inOrder,sPreLeft,ePreLeft,sInLeft,eInLeft);
        BinaryTreeNode<Integer> right=buildTreeHelper(preOrder,inOrder,sPreRight,ePreRight,sInRight,eInRight);
        root.left=left;
        root.right=right;
        return root;
    }

    public static void main(String[] args) {

    }
}
