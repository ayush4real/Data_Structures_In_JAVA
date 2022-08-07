package BinaryTrees;

import java.util.Scanner;

public class CheckIsBinaryTreeBalanced {

    public static BalancedTreeReturn isBTreeBalancedBetter(BinaryTreeNode<Integer> root){
        if (root==null){
            int height=0;
            boolean isBalanced=true;
            BalancedTreeReturn ans=new BalancedTreeReturn();
            ans.height=height;
            ans.isBalanced=isBalanced;
            return ans;
        }

        BalancedTreeReturn leftOutput = isBTreeBalancedBetter(root.left);
        BalancedTreeReturn rightOutput = isBTreeBalancedBetter(root.right);
        boolean isBalanced=true;
        int height=1+Math.max(leftOutput.height, rightOutput.height);

        if(Math.abs(leftOutput.height- rightOutput.height)>1){
            isBalanced=false;
        }
        if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBalanced=false;
        }

        BalancedTreeReturn ans=new BalancedTreeReturn();
        ans.height=height;
        ans.isBalanced=isBalanced;
        return ans;
    }

    public static boolean isBTreeBalanced(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }
        int lH=height(root.left);
        int rH=height(root.right);
        if(Math.abs(lH-rH)>1){
            return false;
        }
        boolean isLeftBalanced=isBTreeBalanced(root.left);
        boolean isRightBalanced=isBTreeBalanced(root.right);
        return isLeftBalanced && isRightBalanced;
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
        System.out.println(isBTreeBalanced(root));
    }
}
