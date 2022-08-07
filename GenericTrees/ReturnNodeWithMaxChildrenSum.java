package GenericTrees;

import static GenericTrees.TakeInputLevelwise.takeInputLevelwise;

public class ReturnNodeWithMaxChildrenSum {

    public static GTreeNode<Integer> maxSumNode(GTreeNode<Integer> root){
        if(root==null){
            return null;
        }
        MaxSChildrenRet maxNode=new MaxSChildrenRet();
        return maxSumNodeHelper(root, new MaxSChildrenRet()).node;
    }

    public static MaxSChildrenRet maxSumNodeHelper(GTreeNode<Integer> root,MaxSChildrenRet maxN){
        int sum=0;
        sum+= root.data;
        for(GTreeNode<Integer> node:root.children){
            sum+= node.data;
        }
        if (sum> maxN.sum){
            maxN.node=root;
            maxN.sum=sum;
        }
        for(GTreeNode<Integer> node: root.children){
            MaxSChildrenRet newN=maxSumNodeHelper(node,maxN);
            if(newN.sum>maxN.sum){
                maxN.node=newN.node;
                maxN.sum= newN.sum;
            }
        }
        return maxN;
    }

    public static void main(String[] args) {
        GTreeNode<Integer> root=takeInputLevelwise();
        GTreeNode<Integer> node=maxSumNode(root);
        if(node!=null){
            System.out.println(node.data);
        }else{
            System.out.println("null");
        }
    }
}
