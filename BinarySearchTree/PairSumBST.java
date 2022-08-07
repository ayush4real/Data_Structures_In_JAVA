package BinarySearchTree;

import BinaryTrees.BinaryTreeNode;

import java.util.ArrayList;

public class PairSumBST {

    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        if(root==null){
            return;
        }else{
            ArrayList<Integer> nodesList=printNodesSumToSHelper(root);
            printPairs(nodesList,s);
        }
    }

    public static ArrayList<Integer> printNodesSumToSHelper(BinaryTreeNode<Integer> root){
        if(root==null){
            return new ArrayList<>();
        }
        ArrayList<Integer> currNodes=new ArrayList<>();
        ArrayList<Integer> leftNodes=printNodesSumToSHelper(root.left);
        if(!leftNodes.isEmpty()){
            currNodes.addAll(leftNodes);
        }
        currNodes.add(root.data);
        ArrayList<Integer> rightNodes=printNodesSumToSHelper(root.right);
        if(!rightNodes.isEmpty()){
            currNodes.addAll(rightNodes);
        }
        return currNodes;
    }

    public static void printPairs(ArrayList<Integer> nodesList, int sum){
        int i=0,j=nodesList.size()-1;
        while(i<j){
            int v1=nodesList.get(i),v2=nodesList.get(j);
            if(v1+v2>sum){
                j--;
            } else if (v1+v2<sum) {
                i++;
            }else {
                System.out.println(v1+" "+v2);
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {

    }
}
