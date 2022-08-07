package BinaryTrees;

import ArraynLinkedLists.Node;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class LevelwiseLinkedList {

    public static ArrayList<Node<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        // Write your code here
        ArrayList<Node<Integer>> list=new ArrayList<>();
        Deque<BinaryTreeNode<Integer>> remNodes=new LinkedList<>();
        Node<Integer> head=null;
        remNodes.add(root);
        remNodes.add(null);
        while(!remNodes.isEmpty()){
            BinaryTreeNode<Integer> front=remNodes.remove();
            if(front!=null){
                if(head==null){
                    Node<Integer> levelHead=new Node<>(front.data);
                    list.add(levelHead);
                    head=levelHead;
                }
                else{
                    head.next=new Node<>(front.left.data);
                }
            }else{
                head=null;
                if(!remNodes.isEmpty()){
                    remNodes.add(null);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
