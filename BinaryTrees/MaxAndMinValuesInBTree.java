package BinaryTrees;

class Pair<T, U> {
    T minimum;
    U maximum;

    public Pair(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}

public class MaxAndMinValuesInBTree {
    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        if(root==null){
            return new Pair<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Pair<Integer,Integer> pLeft=getMinAndMax(root.left);
        Pair<Integer,Integer> pRight=getMinAndMax(root.right);
        return new Pair<>(Math.min(root.data,Math.min(pLeft.minimum, pRight.minimum)),
                Math.max(root.data,Math.max(pLeft.maximum, pRight.maximum)));
    }
}
