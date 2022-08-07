package Strings;

import java.util.Arrays;

public class CheckForEqualOccurenceOfChars {

    public static boolean areOccurrencesEqual(String s) {
        if(s.length()==1){
            return true;
        }
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
//        Arrays.sort(count);
        int freq=count[s.charAt(0)-'a'];
        for(int i=0;i<count.length;i++){
            if(count[i]!=0 && count[i]!=freq) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="aabbb";
        System.out.println(areOccurrencesEqual(s));
    }
}
