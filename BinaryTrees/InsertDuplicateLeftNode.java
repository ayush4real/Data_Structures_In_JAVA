package BinaryTrees;

public class InsertDuplicateLeftNode {

    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }

        BinaryTreeNode<Integer> newLeft=new BinaryTreeNode<>(root.data);
        newLeft.left=root.left;
        root.left=newLeft;
        insertDuplicateNode(newLeft.left);
        insertDuplicateNode(root.right);
    }

    public static void main(String[] args) {

    }
}
