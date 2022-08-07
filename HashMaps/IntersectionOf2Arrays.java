package HashMaps;

import Generics.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOf2Arrays {

    public static void printIntersection(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> hm1=new HashMap<>();
        for(int i: arr1){
            if(hm1.containsKey(i)){
                hm1.put(i,hm1.get(i)+1);
            }else{
                hm1.put(i,1);
            }
        }

        Arrays.sort(arr2);
        for(int i:arr2){
            if(hm1.containsKey(i)){
                int val=hm1.get(i);
                if(val>0){
                    System.out.println(i);
                    hm1.put(i,val-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1={2,6,8,5,4,3};
        int[] arr2={2,3,4,7};
        printIntersection(arr1,arr2);
    }
}
