package BinaryTrees;

public class PrintNodesAtDistanceKFromGivenNodeValue {

    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        printNodes(root,node,k);
    }

    public static int printNodes(BinaryTreeNode<Integer> root, int node, int k) {
        if(root==null){
            return -1;
        }
        int data=root.data;
        if(data==node){
            printNodesAtDepthK(root, k);
            return 0;
        }
        int leftDist=0,rightDist=0;

        leftDist=printNodes(root.left,node,k);
        if(leftDist!=-1){
            if(leftDist+1==k){
                System.out.println(root.data);
            }else {
                rightDist=k-(leftDist+1)-1;
                printNodesAtDepthK(root.right,rightDist);
            }
            return leftDist+1;
        }

        rightDist=printNodes(root.right,node,k);
        if(rightDist!=-1){
            if(rightDist+1==k){
                System.out.println(root.data);
            }else{
                leftDist=k-(rightDist+1)-1;
                printNodesAtDepthK(root.left,leftDist);
            }
            return rightDist+1;
        }
        return -1;
    }

    public static void printNodesAtDepthK(BinaryTreeNode<Integer> root, int k) {
        if(root==null){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }
        printNodesAtDepthK(root.left,k-1);
        printNodesAtDepthK(root.right,k-1);
    }

    public static void main(String[] args) {

    }
}
