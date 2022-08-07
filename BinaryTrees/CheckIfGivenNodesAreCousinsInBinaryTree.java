package BinaryTrees;

import static BinaryTrees.LevelWiseInputandPrintBinaryTree.takeInputLevelWiseInput;

public class CheckIfGivenNodesAreCousinsInBinaryTree {

    public static boolean areCousins(BinaryTreeNode<Integer> root,int a, int b){
        if(root==null){
            return false;
        }

        BinaryTCousinReturn node1=areCousinsHelper(root,0,a);
        BinaryTCousinReturn node2=areCousinsHelper(root,0,b);
        if(node1.parent==null || node2.parent==null){
            return false;
        }
        return node1.parent != node2.parent && node1.depth == node2.depth;
    }

    public static BinaryTCousinReturn areCousinsHelper(BinaryTreeNode<Integer> root, int depth,int x){
        if(root==null){
            return new BinaryTCousinReturn(null,0);
        }

        if(root.left!=null && root.left.data==x){
            return new BinaryTCousinReturn(root,depth+1);
        }
        if(root.right!=null && root.right.data==x){
            return new BinaryTCousinReturn(root,depth+1);
        }
        BinaryTCousinReturn leftParent=areCousinsHelper(root.left,depth+1,x);
        if(leftParent.parent!=null){
            return leftParent;
        }
        BinaryTCousinReturn rightParent=areCousinsHelper(root.right,depth+1,x);
        if(rightParent.parent!=null){
            return rightParent;
        }
        return new BinaryTCousinReturn(null,0);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=takeInputLevelWiseInput();
        System.out.println(areCousins(root,7,5));
    }
}
