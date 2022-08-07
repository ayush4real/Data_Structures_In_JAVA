package BinaryTrees;

import java.util.Scanner;

public class NodesGreaterThanX {

    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        if(root==null){
            return 0;
        }
        int c=0;
        if(root.data>x){
            c+=1;
        }
        c+=countNodesGreaterThanX(root.left,x);
        c+=countNodesGreaterThanX(root.right,x);
        return c;
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
        System.out.println(countNodesGreaterThanX(root,5));
    }
}
