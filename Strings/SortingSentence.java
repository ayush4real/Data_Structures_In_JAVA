package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingSentence {

    public static String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] words2=new String[words.length];
        for(String s1: words){
            char last=s1.charAt(s1.length()-1);
            words2[last-49]=s1.substring(0,s1.length()-1);
        }
        return String.join(" ",words2);
    }

    public static void main(String[] args) {
        String s="Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s));
    }
}
