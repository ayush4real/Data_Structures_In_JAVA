package GenericTrees;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class NextLargerElementInGTree {

    private static Stack<GTreeNode<Integer>> stack=new Stack<>();

    public static GTreeNode<Integer> findNextLargerNode_2(GTreeNode<Integer> root, int n){
        if(root==null){
            return null;
        }
        GTreeNode<Integer> gNode=null;
        if(root.data>n){
            gNode=root;
        }
        for(GTreeNode<Integer> node: root.children){
            GTreeNode<Integer> newNode=findNextLargerNode_2(node,n);
            if(gNode==null && newNode!=null){
                gNode=newNode;
            }
            if(gNode!=null && newNode!=null && gNode.data>newNode.data){
                gNode=newNode;
            }
        }
        return gNode;
    }

    public static GTreeNode<Integer> findNextLargerNode(GTreeNode<Integer> root, int n){
        if(root==null){
            return null;
        }
        if(root.data>n){
            if(stack.isEmpty()){
                stack.push(root);
            }else {
                if(stack.peek().data>root.data){
                    stack.push(root);
                }
            }
        }
        for(GTreeNode<Integer> node: root.children){
            findNextLargerNode(node,n);
        }
        if(stack.isEmpty()) return null;

        return stack.peek();
    }

    public static void main(String[] args) {

    }
}
