package DynamicProgramming;

import java.util.Arrays;

public class MaxMoneyLooted {

    public static int maxMoneyLooted(int[] houses) {
        return maxMoneyLootedHelper(houses,0);
    }

//    Recursive
    public static int maxMoneyLootedHelper(int[] houses, int index) {
        if(index>=houses.length){
            return 0;
        }
        if(index==houses.length-1){
            return houses[index];
        }
        int housePicked=houses[index]+maxMoneyLootedHelper(houses,index+2);
        int houseNotPicked=maxMoneyLootedHelper(houses,index+1);
        return Math.max(housePicked,houseNotPicked);
    }

//    Recursive+Memoization
    public static int maxMoneyLooted_2(int[] houses){
        int n=houses.length;
        if(n==0){
            return 0;
        }
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=houses[0];
        dp[1]=Math.max(houses[0],houses[1]);
        return maxMoneyLooted_2Helper(houses,n-1,dp);
    }
    public static int maxMoneyLooted_2Helper(int[] houses,int n, int[] dp) {
        if(n<0){
            return 0;
        }
        if(n==0){
            return houses[0];
        }
        if(n==1){
            return dp[1];
        }
        int housePicked,houseNotPicked;
        if(dp[n]==-1){
            housePicked=houses[n]+maxMoneyLooted_2Helper(houses,n-2,dp);
        }else{
            housePicked=dp[n];
        }
        houseNotPicked=maxMoneyLooted_2Helper(houses,n-1,dp);
        dp[n]=Math.max(houseNotPicked,housePicked);
        return dp[n];
    }

//    Iterative - Bottom Up
    public static int maxMoneyLooted_3(int[] houses){
        int n=houses.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return houses[0];
        }
        if(n==2){
            return Math.max(houses[0], houses[1]);
        }
        int[] dp=new int[n];
        dp[0]=houses[0];
        dp[1]=Math.max(houses[0], houses[1]);
        for(int i=2;i<n;i++){
            int housePicked=houses[i]+dp[i-2];
            int houseNotPicked=dp[i-1];
            dp[i]=Math.max(housePicked,houseNotPicked);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] arr={5,5,10,100,10,5};

        System.out.println(maxMoneyLooted(arr));
    }
}
