package DynamicProgramming_2;

public class KnapSack01Recursive {

    public static int knapsack(int[] weights, int[] values, int n, int maxWeight, int i) {
        if(i>=n){
            return 0;
        }
        if(weights[i]>maxWeight){
            return knapsack(weights,values,n,maxWeight,i+1);
        }else{
            int includeItem=values[i]+knapsack(weights,values,n,maxWeight-weights[i],i+1);
            int excludeWeight=knapsack(weights,values,n,maxWeight,i+1);
            return Math.max(includeItem,excludeWeight);
        }
    }

    public static void main(String[] args) {
        int[] wt={12,7,11,8,9};
        int[] values={24,13,23,15,16};
        int n=5;
        int maxW=26;
        System.out.println(knapsack(wt,values,n,maxW,0));
    }
}
