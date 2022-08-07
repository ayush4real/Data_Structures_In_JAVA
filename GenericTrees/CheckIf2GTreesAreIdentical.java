package GenericTrees;

public class CheckIf2GTreesAreIdentical {

    public static boolean checkIdentical(GTreeNode<Integer> root1, GTreeNode<Integer> root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        if(root2==null){
            return false;
        }

        if(root1.children.size() != root2.children.size()){
            return false;
        }
        for(int i=0;i<root1.children.size();i++){
            int v1=root1.children.get(i).data;
            int v2=root2.children.get(i).data;
            if(v1!=v2){
                return false;
            }
        }
        for (int i=0;i<root1.children.size();i++){
            boolean identical=checkIdentical(root1.children.get(i),root2.children.get(i));
            if(!identical){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
