package BinarySearchTree;

import BinaryTrees.BinaryTreeNode;

import java.util.ArrayList;

public class PathToGivenNode {

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        if (root == null) {
            return null;
        }
        if(root.data==data){
            ArrayList<Integer> path=new ArrayList<>();
            path.add(data);
            return path;
        }
        ArrayList<Integer> path;
        if(root.data<data){
            path = getPath(root.right, data);
        }else {
            path = getPath(root.left, data);
        }
        if(path!=null){
            path.add(root.data);
        }
        return path;
    }

    public static void main(String[] args) {

    }
}
