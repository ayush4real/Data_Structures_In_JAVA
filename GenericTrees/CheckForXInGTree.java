package GenericTrees;

public class CheckForXInGTree {

    public static boolean checkIfContainsX(GTreeNode<Integer> root, int x){
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        for(GTreeNode<Integer> node:root.children){
            boolean isP=checkIfContainsX(node,x);
            if (isP) return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
