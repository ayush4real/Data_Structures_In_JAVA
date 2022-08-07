package GenericTrees;

public class GTreeUse {
    public static void main(String[] args) {
        GTreeNode<Integer> root=new GTreeNode<>(4);
        GTreeNode<Integer> node1=new GTreeNode<>(2);
        GTreeNode<Integer> node2=new GTreeNode<>(3);
        GTreeNode<Integer> node3=new GTreeNode<>(1);
        GTreeNode<Integer> node4=new GTreeNode<>(5);
        GTreeNode<Integer> node5=new GTreeNode<>(6);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);
    }
}
