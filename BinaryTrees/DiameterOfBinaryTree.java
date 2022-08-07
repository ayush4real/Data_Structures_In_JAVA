package BinaryTrees;

import java.util.Scanner;

public class DiameterOfBinaryTree {
    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int lH=height(root.left);
        int rH=height(root.right);
        int lD=diameterOfBinaryTree(root.left);
        int rD=diameterOfBinaryTree(root.right);
        if(lD>rD && lD>lH+rH){
            return lD;
        } else if (rD>lD && rD>lH+rH) {
            return rD;
        }else{
            return lH+rH+1;
        }
    }

    public static DiameterTreeReturn diameterOfBinaryTreeBetter(BinaryTreeNode<Integer> root){
        if(root==null){
            DiameterTreeReturn ans=new DiameterTreeReturn();
            ans.height=0;
            ans.diameter=0;
            return ans;
        }

        DiameterTreeReturn left=diameterOfBinaryTreeBetter(root.left);
        DiameterTreeReturn right=diameterOfBinaryTreeBetter(root.right);
        int height=1+Math.max(left.height,right.height);
        int diameter=0;
//                Math.max(left.height+ right.height+1,Math.max(left.diameter, right.diameter));
        if(left.diameter> right.diameter && left.diameter>height){
            diameter=left.diameter;
        } else if (right.diameter>left.diameter && right.diameter>height) {
            diameter= right.diameter;
        }else{
            diameter= left.height+right.height+1;
//            height=height+1;
        }
        DiameterTreeReturn ans=new DiameterTreeReturn();
        ans.height=height;
        ans.diameter=diameter;
        return ans;
    }

    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int h=1;
        int lH=h+height(root.left);
        int rH=h+height(root.right);
        return Math.max(lH,rH);
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
        BinaryTreeNode<Integer> root=takeInputBetter(true,0,true);
        System.out.println(diameterOfBinaryTreeBetter(root).diameter);
    }
}
