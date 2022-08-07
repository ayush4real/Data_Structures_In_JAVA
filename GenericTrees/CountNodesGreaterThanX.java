package GenericTrees;

public class CountNodesGreaterThanX {

    public static int numNodeGreater(GTreeNode<Integer> root,int x){
        if(root==null){
            return 0;
        }
        int count=0;
        if(root.data>x){
            count++;
        }
        for(GTreeNode<Integer> node: root.children){
            count+=numNodeGreater(node,x);
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
