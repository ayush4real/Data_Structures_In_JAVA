package GenericTrees;

public class PostOrderTraversalGenericTree {

    public static void printPostOrder(GTreeNode<Integer> root){
        if(root==null){
            return;
        }
        for(GTreeNode<Integer> node: root.children){
            printPostOrder(node);
        }
        System.out.println(root.data);
    }

    public static void main(String[] args) {

    }
}
