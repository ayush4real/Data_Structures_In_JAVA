package GenericTrees;

import static GenericTrees.TakeInputLevelwise.takeInputLevelwise;

public class CountLeafNodesInGenericTree {

    public static int countLeafNodes(GTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int count=0;
        if (root.children.size()==0){
            count++;
        }
        for(GTreeNode<Integer> node:root.children){
            count+=countLeafNodes(node);
        }
        return count;
    }

    public static void main(String[] args) {
        GTreeNode<Integer> root=takeInputLevelwise();
        System.out.println(countLeafNodes(root));
    }
}
