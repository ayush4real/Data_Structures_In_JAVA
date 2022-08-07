package BinarySearchTree;

import ArraynLinkedLists.Node;
import BinaryTrees.BinaryTreeNode;

public class ConvertBSTToLL {

    public static Node<Integer> bstToLL(BinaryTreeNode<Integer> root){
        return bstToLLHelper(root).head;
    }

    public static BSTLLNode<Integer> bstToLLHelper(BinaryTreeNode<Integer> root){
        if(root==null){
            BSTLLNode<Integer> ans=new BSTLLNode<>();
            ans.head=null;
            ans.tail=null;
            return ans;
        }
        BSTLLNode<Integer> LeftLL=bstToLLHelper(root.left);
        BSTLLNode<Integer> RightLL=bstToLLHelper(root.right);
        BSTLLNode<Integer> ans=new BSTLLNode<>();
        ans.head=new Node<>(root.data);
        ans.tail=ans.head;
        if(LeftLL.tail!=null){
            ans.head=LeftLL.head;
            ans.tail=LeftLL.tail;
            ans.tail.next=new Node<>(root.data);
            ans.tail=ans.tail.next;
        }
        if(RightLL.head!=null){
            ans.tail.next=RightLL.head;
            ans.tail=RightLL.tail;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
