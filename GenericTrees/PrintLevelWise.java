package GenericTrees;

import java.util.Deque;
import java.util.LinkedList;

public class PrintLevelWise {

    public static void printLevelwise(GTreeNode<Integer> root){
        if(root==null){
            return;
        }
        Deque<GTreeNode<Integer>> remNodes=new LinkedList<>();
        remNodes.add(root);
        remNodes.add(null);
        while(!remNodes.isEmpty()){
            GTreeNode<Integer> front=remNodes.remove();
            if(front!=null){
                System.out.print(front.data+" ");
                remNodes.addAll(front.children);
            }else{
                System.out.println();
                if(!remNodes.isEmpty()){
                    remNodes.add(null);
                }
            }
        }
    }
}
