package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveIncreasingSeq {

    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }

        int longestSeq=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i: arr){
            if(!hs.contains(i-1)){
                int currNum=i;
                int currSeqLen=1;
                while(hs.contains(currNum+1)){
                    currNum+=1;
                    currSeqLen+=1;
                }
                if(currSeqLen>longestSeq){
                    longestSeq=currSeqLen;
                    list=new ArrayList<>();
                    list.add(i);
                    list.add(currNum);
                }
            }
        }
        return list;
    }

    public static ArrayList<Integer> longestConsecutiveIncreasingSequenceHashMap(int[] arr){
        HashMap<Integer,Boolean> hm=new HashMap<>();
        HashMap<Integer,Integer> hmIndices=new HashMap<>();
        for(int i:arr){
            hm.put(i,true);
        }
        for(int i=0;i<arr.length;i++){
            if(!hmIndices.containsKey(arr[i])){
                hmIndices.put(arr[i],i);
            }
        }
        int maxLen=0,prevStart=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i: arr){
            if(hm.get(i)){
                hm.put(i,false);
                int currLen=1;
                int currNum=i;

                while(hm.containsKey(currNum+1) && hm.get(currNum+1)){
                    currLen+=1;
                    currNum+=1;
                    hm.put(currNum,false);
                }
                int end=currNum;
                currNum=i;
                while(hm.containsKey(currNum-1) && hm.get(currNum-1)){
                    currLen+=1;
                    currNum-=1;
                    hm.put(currNum,false);
                }
                int start=currNum;

                int si=hmIndices.get(start);
                if(currLen>maxLen){
                    list=new ArrayList<>();
                    list.add(start);
                    list.add(end);
                    maxLen=currLen;
                    prevStart=start;
                }else if(currLen==maxLen && si<hmIndices.get(prevStart)){
                    list=new ArrayList<>();
                    list.add(start);
                    list.add(end);
                    prevStart=start;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        ArrayList<Integer> list=longestConsecutiveIncreasingSequenceHashMap(arr);
        for(int i: list){
            System.out.print(i+" ");
        }
    }
}
