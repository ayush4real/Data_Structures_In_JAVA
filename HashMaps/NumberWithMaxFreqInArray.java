package HashMaps;

import java.util.HashMap;

public class NumberWithMaxFreqInArray {

    public static int maxFrequencyNumber(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();

        for (int j : arr) {
            int val = hm.getOrDefault(j, 0) + 1;
            hm.put(j, val);
        }
        int value=-1;
        int currE=arr[0];
        for(int i:arr){
            if(hm.get(i)>value){
                value=hm.get(i);
                currE=i;
            }
        }
        return currE;
    }

    public static void main(String[] args) {
        int[] arr={2,2,1,2,1,1};
        System.out.println(maxFrequencyNumber(arr));
    }
}
