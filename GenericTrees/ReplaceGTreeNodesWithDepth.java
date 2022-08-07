package GenericTrees;

public class ReplaceGTreeNodesWithDepth {

    public static void replaceWithDepthValue(GTreeNode<Integer> root){
        replaceWithDepthValueHelper(root,0);
    }

    public static void replaceWithDepthValueHelper(GTreeNode<Integer> root, int depth){
        if(root==null){
            return;
        }
        root.data=depth;
        for(GTreeNode<Integer> node: root.children){
            replaceWithDepthValueHelper(node,depth+1);
        }
    }

    public static void main(String[] args) {

    }
}
