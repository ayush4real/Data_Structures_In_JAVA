package BinaryTrees;

public class BTreeUsingPostorderAndInorder {
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        BinaryTreeNode<Integer> root=buildTreeHelper(postOrder,inOrder,0, postOrder.length-1,
                0, inOrder.length-1 );
        return root;
    }

    public static BinaryTreeNode<Integer> buildTreeHelper(int[] postOrder, int[] inOrder,int sPos,
                                                          int ePos,int sIn,int eIn){
        if(sPos>ePos){
            return null;
        }

        int rootData=postOrder[ePos];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        int index=-1;
        for(int i=sIn;i<=eIn;i++){
            if(inOrder[i]==rootData){
                index=i;
                break;
            }
        }
        int sPosLeft=sPos;
        int sInLeft=sIn;
        int eInLeft=index-1;
        int ePosRight=ePos-1;
        int sInRight=index+1;
        int eInRight=eIn;

        int leftSubTreeLen=eInLeft-sInLeft+1;
        int ePosLeft=leftSubTreeLen+sPosLeft-1;
        int sPosRight=ePosLeft+1;

        BinaryTreeNode<Integer> left=buildTreeHelper(postOrder,inOrder,sPosLeft,ePosLeft,sInLeft,eInLeft);
        BinaryTreeNode<Integer> right=buildTreeHelper(postOrder,inOrder,sPosRight,ePosRight,sInRight,eInRight);
        root.left=left;
        root.right=right;
        return root;
    }

    public static void main(String[] args) {

    }
}
