package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxCandiesArrayList {
    public static void main(String[] args) {
        int candies[]= {4,2,1,1,2};
        int extraCandies=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }

        List<Boolean> arr= new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            arr.add(candies[i]+extraCandies>=max);
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
