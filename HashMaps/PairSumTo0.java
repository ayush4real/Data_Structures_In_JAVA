package HashMaps;

import java.util.HashMap;

public class PairSumTo0 {

    public static int PairSum(int[] input) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i: input){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int i:input){
            if(i!=0){
                int v1=hm.get(i);
                int pairVal=-i;
                if(hm.containsKey(pairVal)){
                    int v2=hm.get(pairVal);
                    count+=v1*v2;
                    hm.put(pairVal,0);
                    hm.put(i,0);
                }
            }
        }
        if(hm.containsKey(0)){
            int val=hm.get(0);
            count+=(val*(val-1))/2;
        }
        return count;
    }

    public static int PairSumOptimized(int[] input){
        if(input.length==0){
            return 0;
        }
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i: input){
            if(hm.containsKey(-i)){
                count+=hm.get(-i);
            }
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={-2,2,6,-2,2,-6,3};
        System.out.println(PairSum(arr));
    }
}
