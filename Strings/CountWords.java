package Strings;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public static int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> hm1=new HashMap<>();
        HashMap<String, Integer> hm2=new HashMap<>();

        for(String s: words1){
            if(hm1.get(s)!=null){
                hm1.put(s, hm1.get(s)+1);
            }else{
                hm1.put(s,1);
                hm2.put(s,0);
            }
        }
        for(String s: words2){
            if(hm1.get(s)!=null){
                hm2.put(s, hm2.get(s)+1);
            }else{
                hm2.put(s,1);
            }
        }
        int c=0;
        if(words1.length<=words2.length){
            for(String s: words1){
                if(hm1.get(s)==1 && hm2.get(s)==1){
                    c++;
                }
            }
        }else{
            for(String s: words2){
                if(hm1.get(s)==1 && hm2.get(s)==1){
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String[] words1={"a","ab"};
        String[] words2={"a","a","a","ab"};
        System.out.println(countWords(words1,words2));
    }
}
