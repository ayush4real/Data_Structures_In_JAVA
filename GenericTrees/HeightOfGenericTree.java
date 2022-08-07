package GenericTrees;

import java.util.ArrayList;

import static GenericTrees.TakeInputLevelwise.takeInputLevelwise;

public class HeightOfGenericTree {

    public static int getHeight(GTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int height=1;
        int currH=0;
        for(GTreeNode<Integer> node: root.children){
            int h=getHeight(node);
            if(h>currH) currH=h;
        }
        return height+currH;
    }

    public static void main(String[] args) {
        GTreeNode<Integer> root=takeInputLevelwise();
        System.out.println(getHeight(root));
    }
}
