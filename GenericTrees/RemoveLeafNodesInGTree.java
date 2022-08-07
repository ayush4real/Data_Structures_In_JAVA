package GenericTrees;

import java.util.ArrayList;

import static GenericTrees.PrintLevelWise.printLevelwise;
import static GenericTrees.TakeInputLevelwise.takeInputLevelwise;

public class RemoveLeafNodesInGTree {

    public static void removeLeafNodes(GTreeNode<Integer> root){
        if(root==null){
            return;
        }
        for(int i=root.children.size()-1;i>=0;i--){
            GTreeNode<Integer> node=root.children.get(i);
            if(node.children.size()==0){
                root.children.remove(node);
            }
        }
        for(GTreeNode<Integer> node: root.children){
            removeLeafNodes(node);
        }
    }

    public static void main(String[] args) {
        GTreeNode<Integer> root=takeInputLevelwise();
        removeLeafNodes(root);
        printLevelwise(root);
    }
}
