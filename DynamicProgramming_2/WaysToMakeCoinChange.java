package DynamicProgramming_2;

import java.util.Arrays;

public class WaysToMakeCoinChange {

//    Recursive - TLE
    public static int countWaysToMakeChange(int denominations[], int value,int index){
        if(value==0){
            return 1;
        }
        if(index>=denominations.length){
            return 0;
        }
        int ans1=0;
        if(denominations[index]<=value){
            ans1=countWaysToMakeChange(denominations,value-denominations[index],index);
        }
        int ans2=countWaysToMakeChange(denominations,value,index+1);
        return ans1+ans2;
    }

//    Recursive+Memoization
    public static int countWaysToMakeChange_2(int[][] dp, int[] denominations, int value,int index){
        if(value==0){
            return 1;
        }
        if(index>=denominations.length){
            return 0;
        }
        if (dp[index][value] == -1) {
            int ans1 = 0;
            if (denominations[index] <= value) {
                ans1 = countWaysToMakeChange_2(dp, denominations, value - denominations[index], index);
            }
            int ans2 = countWaysToMakeChange_2(dp, denominations, value, index + 1);
            dp[index][value] = ans1 + ans2;
        }
        return dp[index][value];
    }

//    Iterative
    public static int countWaysToMakeChange_3(int[] denominations, int value){
        int n=denominations.length;
        int[][] dp=new int[n+1][value+1];
        Arrays.fill(dp[0],0);
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=value;j++){
                int ans1=0;
                if(denominations[i-1]<=j){
                    ans1=dp[i][j-denominations[i-1]];
                }
                int ans2=dp[i-1][j];
                dp[i][j]=ans1+ans2;
            }
        }
        return dp[n][value];
    }

    public static void main(String[] args) {
        int[] denominations={1,2,3};
        int val=4;
        int[][] dp=new int[denominations.length+1][val+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
//        System.out.println(countWaysToMakeChange_2(dp,denominations,val,0));
        System.out.println(countWaysToMakeChange_3(denominations,val));

    }
}
