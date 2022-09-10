package HashMaps;

import java.util.HashMap;

public class PairsWithDifferenceK {

    public static int getPairsWithDifferenceK(int[] arr, int k) {
       if(arr.length==0){
           return 0;
       }
       int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i: arr){
           hm.put(i,hm.getOrDefault(i,0)+1);
       }
       for(int i: arr){
           if(k!=0){
               if(hm.containsKey(i+k)){
                   int val1=hm.get(i);
                   int val2=hm.get(k+i);
                   count+=val1*val2;
               }
               if(hm.containsKey(i-k)){
                   int val1=hm.get(i);
                   int val2=hm.get(i-k);
                   count+=val1*val2;
               }
               hm.put(i,0);
           }else{
               int val=hm.get(i);
               count+=(val*(val-1))/2;
               hm.put(i,0);
           }
       }
       return count;
    }

    public static int getPairsWithDifferenceKOptimized(int[] arr, int k){
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            if(k!=0){
                if(hm.containsKey(k+i)){
                    count+=hm.get(k+i);
                }if (hm.containsKey(i-k)) {
                    count+=hm.get(i-k);
                }
            }else{
                if(hm.containsKey(i)){
                    count+=hm.get(i);
                }
            }
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={2,-1,3,5,6,0,-1,2,6};
        int[] arr2={4,4,4,4};
        int k1=3,k2=0;
        System.out.println(getPairsWithDifferenceKOptimized(arr,k1));
        System.out.println(getPairsWithDifferenceKOptimized(arr2,k2));
    }
}
