package GenericTrees;

import java.util.ArrayList;

public class GTreeNode<T> {
    T data;
    ArrayList<GTreeNode<T>> children;

    public GTreeNode(T data){
        this.data=data;
        children=new ArrayList<>();
    }
}
