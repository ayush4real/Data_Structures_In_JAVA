package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for (int j : arr) {
            if (hm.getOrDefault(j, 0) == 0) {
                hm.put(j, 1);
                list.add(j);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,5,4,6};
        ArrayList<Integer> list=removeDuplicates(arr);
        for(int i: list){
            System.out.print(i+" ");
        }
    }
}
