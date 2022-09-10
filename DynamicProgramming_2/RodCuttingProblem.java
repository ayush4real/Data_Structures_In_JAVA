package DynamicProgramming_2;

import java.util.Arrays;

public class RodCuttingProblem {

    public static int maxProfit_1(int rodLength, int[] price){
        int[] lengthArr=new int[rodLength];
        for(int i=0;i<rodLength;i++){
            lengthArr[i]=i+1;
        }
        return maxProfitHelper_1(lengthArr,rodLength,price,0);
    }

//    Recursive
    public static int maxProfitHelper_1(int[] lengthArr ,int rodLength, int[] price, int index){
        if(index>=lengthArr.length){
            return 0;
        }
        if(lengthArr[index]>rodLength){
            return maxProfitHelper_1(lengthArr,rodLength,price,index+1);
        }else{
            int includePiece=price[index]+ maxProfitHelper_1(lengthArr,rodLength-lengthArr[index],
                    price,index);
            int excludePiece=maxProfitHelper_1(lengthArr,rodLength,
                    price,index+1);
            return Math.max(includePiece,excludePiece);
        }
    }

//Recursive+Memoization
    public static int maxProfit_2(int rodLength, int[] price){
        int[][] dp=new int[rodLength+1][rodLength+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return maxProfitHelper_2(dp,rodLength,price,0);
    }
    public static int maxProfitHelper_2(int[][] dp,int rodLength, int[] price, int index){
        if(index>= price.length){
            return 0;
        }
        if(dp[index][rodLength]!=-1){
            return dp[index][rodLength];
        }else{
            if(index+1>rodLength){
                dp[index][rodLength]=maxProfitHelper_2(dp,rodLength,price,index+1);
            }else{
                int ans1=price[index]+maxProfitHelper_2(dp,rodLength-index-1,price,index);
                int ans2=maxProfitHelper_2(dp,rodLength,price,index+1);
                dp[index][rodLength]=Math.max(ans1,ans2);
            }
            return dp[index][rodLength];
        }
    }

//    Iterative
    public static int maxProfit_3(int rodLength, int[] price){
        int[][] dp=new int[rodLength+1][rodLength+1];
        for(int i=1;i<=price.length;i++){
            for(int j=1;j<=rodLength;j++){
                if(i>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    int ans1=price[i-1]+ dp[i][j-i];
                    int ans2=dp[i-1][j];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[rodLength][rodLength];
    }

    public static void main(String[] args) {
        int rodLength=8;
        int[] price={1,5,8,9,10,17,17,20};
        System.out.println(maxProfit_1(rodLength,price));

        System.out.println(maxProfit_2(rodLength,price));
        System.out.println(maxProfit_3(rodLength,price));
    }
}
