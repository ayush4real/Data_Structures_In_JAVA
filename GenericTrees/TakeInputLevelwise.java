package GenericTrees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import static GenericTrees.PrintGenericTree_2.printGTree_2;

public class TakeInputLevelwise {

    public static GTreeNode<Integer> takeInputLevelwise(){
        System.out.println("Enter root data");
        Scanner s=new Scanner(System.in);
        int rootData= s.nextInt();
        if(rootData==-1){
            return null;
        }
        Deque<GTreeNode<Integer>> nodes=new LinkedList<>();
        GTreeNode<Integer> root=new GTreeNode<>(rootData);
        root.children=new ArrayList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            GTreeNode<Integer> front=nodes.remove();
            System.out.println("Enter number of children for: "+front.data);
            int numC=s.nextInt();
            front.children=new ArrayList<>();
            int i=1;
            while(i<=numC){
                System.out.println("Enter child "+i+" for"+front.data);
                int childData=s.nextInt();
                GTreeNode<Integer> child=new GTreeNode<>(childData);
                front.children.add(child);
                nodes.add(child);
                i++;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        GTreeNode<Integer> root=takeInputLevelwise();
        printGTree_2(root);
    }
}
