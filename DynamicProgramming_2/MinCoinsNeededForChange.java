package DynamicProgramming_2;

import java.util.Arrays;

public class MinCoinsNeededForChange {

//    Recursive TLE
    public static int minCoinsNeeded_1(int[] coins, int amount, int index){
        if(index>=coins.length && amount!=0){
            return Integer.MAX_VALUE-1;
        }
        if(amount==0){
            return 0;
        }
        if(coins[index]>amount){
            return minCoinsNeeded_1(coins,amount,index+1);
        }else{
            int includeCoin=1+minCoinsNeeded_1(coins,amount-coins[index],index);
            int excludeCoin=minCoinsNeeded_1(coins,amount,index+1);
            return Math.min(includeCoin,excludeCoin);
        }
    }

    public static int minCoinsNeeded_2(int[] coins, int amount){
        int[][] dp=new int[coins.length+1][amount+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        int val=minCoinsNeededHelper_2(dp,coins,amount,0);
        return val== Integer.MAX_VALUE-1?-1:val;
    }

    public static int minCoinsNeededHelper_2(int[][] dp,int[] coins, int amount, int index){
        if(index>=coins.length && amount!=0){
            return Integer.MAX_VALUE-1;
        }
        if(amount==0){
            return 0;
        }
        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }else{
            if(coins[index]>amount){
                return minCoinsNeededHelper_2(dp,coins,amount,index+1);
            }else{
                int includeCoin=1+minCoinsNeededHelper_2(dp,coins,amount-coins[index],index);
                int excludeCoin=minCoinsNeededHelper_2(dp,coins,amount,index+1);
                return Math.min(includeCoin,excludeCoin);
            }
        }
    }

//    Iterative
    public static int minCoinsNeeded_3(int[] coins, int amount){
        int[][] dp=new int[coins.length+1][amount+1];
        Arrays.fill(dp[0],Integer.MAX_VALUE-1);
        for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                }
            }
        }
        int val=dp[coins.length][amount];
        return val== Integer.MAX_VALUE-1?-1:val;
    }

    public static void main(String[] args) {
        int[] coins={1,2,3};
        int amount=7;
        System.out.println(minCoinsNeeded_1(coins,amount,0));
    }
}
