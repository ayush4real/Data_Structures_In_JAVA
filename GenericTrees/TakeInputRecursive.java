package GenericTrees;

import java.util.ArrayList;
import java.util.Scanner;

import static GenericTrees.PrintGenericTree_2.printGTree_2;

public class TakeInputRecursive {

    public static GTreeNode<Integer> takeInputRecursive(boolean isRoot, int parentData, GTreeNode<Integer> parentNode){
        Scanner s=new Scanner(System.in);
        if(isRoot){
            System.out.println("Enter root data");
            int rootData=s.nextInt();
            GTreeNode<Integer> root=new GTreeNode<>(rootData);
            root.children=new ArrayList<>();
            System.out.println("Enter number of children for "+rootData);
            int numC=s.nextInt();
            int i=1;
            while(i<=numC){
                System.out.println("Enter child "+i+" for "+rootData);
                int childData=s.nextInt();
                GTreeNode<Integer> child=new GTreeNode<>(childData);
//                root.children.add(child);
                child= takeInputRecursive(false,childData,child);
                root.children.add(child);
                i++;
            }
            return root;
        }else {
            System.out.println("Enter number of children for: "+parentData);
            int numC=s.nextInt();
            int i=1;
            while(i<=numC){
                System.out.println("Enter child "+i+" for "+parentData);
                int childData=s.nextInt();
                GTreeNode<Integer> child=new GTreeNode<>(childData);
//                root.children.add(child);
                child= takeInputRecursive(false,childData,child);
                parentNode.children.add(child);
                i++;
            }
            return parentNode;
        }
    }

    public static void main(String[] args) {
        GTreeNode<Integer> root=takeInputRecursive(true,0,null);
        printGTree_2(root);
    }
}
