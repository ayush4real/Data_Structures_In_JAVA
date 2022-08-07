package BinarySearchTree;

import BinaryTrees.BinaryTreeNode;

public class LowestCommonAncestor {

    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if(root==null){
            return -1;
        }
        int isA=-1,isB=-1;
        int node=-1;
        if(a< root.data && b< root.data){
            node=getLCA(root.left,a,b);
        }
        else if(a> root.data && b> root.data){
            node=getLCA(root.right,a,b);
        }
        else if( a== root.data && b==root.data){
            return root.data;
        }
        else if(a == root.data){
            return a;
        }
        else if(b == root.data){
            return b;
        }
        else{
            if(a<root.data && b>= root.data){
                isA=findNode(root.left,a);
                isB=findNode(root.right,b);
            }
            if(a>= root.data && b< root.data){
                isA=findNode(root.right,a);
                isB=findNode(root.left,b);
            }
            if(isA==-1 && isB!=-1){
                node=isB;
            }
            if(isA!=-1 && isB==-1){
                node=isA;
            }
            if(isA!=-1 && isB!=-1){
                node=root.data;
            }
        }
        return node;
    }

    public static int findNode(BinaryTreeNode<Integer> root, int val) {
        if(root==null){
            return -1;
        }
        if(val== root.data){
            return val;
        }
        int isPresent=-1;
        if(val<root.data){
            isPresent=findNode(root.left,val);
        }else{
            isPresent=findNode(root.right,val);
        }
        return isPresent;
    }

    public static void main(String[] args) {

    }
}
