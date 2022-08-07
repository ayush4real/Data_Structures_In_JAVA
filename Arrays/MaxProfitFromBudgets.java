package Arrays;

import java.util.Arrays;

public class MaxProfitFromBudgets {

    public static int maximumProfit(int budget[]){
        Arrays.sort(budget);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<budget.length;i++){
            int c=budget[i] * (budget.length-i);
            if(max<c) max=c;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={34 ,78 ,90 ,15 ,67};
        System.out.println(maximumProfit(arr));
    }
}
