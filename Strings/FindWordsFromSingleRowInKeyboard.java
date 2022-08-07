package Strings;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FindWordsFromSingleRowInKeyboard {

    public static String[] findWords(String[] words) {
        ArrayList<String> arr=new ArrayList<>();
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";

        for(String s: words){
            String str=s.toLowerCase();
            boolean flag=true;
            if(s1.indexOf(str.charAt(0))!=-1){
                for(char c: str.toCharArray()){
                    if(s1.indexOf(c)==-1){
                        flag=false;
                    }
                }
            } else if (s2.indexOf(str.charAt(0))!=-1) {
                for(char c: str.toCharArray()){
                    if(s2.indexOf(c)==-1){
                        flag=false;
                    }
                }
            }else{
                for(char c: str.toCharArray()){
                    if(s3.indexOf(c)==-1){
                        flag=false;
                    }
                }
            }
            if(flag) arr.add(s);
        }
        return arr.toArray(new String[arr.size()]);
    }

    public static void main(String[] args) {
        String[] words={"adsdf","sfd"};
        String[] arr=findWords(words);
        for(String s: arr){
            System.out.println(s);
        }
    }
}
