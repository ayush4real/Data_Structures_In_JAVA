package Strings;

import java.util.Arrays;

public class IncreasingDecreasingString {

    public static String sortString(String s){
        int[] arr=new int[26];
        int sum=0;
        String str="";
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            sum++;
        }
        while(sum>0){
            for(int i=0;i< arr.length;i++){
                if(arr[i]>0){
                    str+=(char)('a'+i);
                    arr[i]--;
                    sum--;
                }
            }
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]>0){
                    str+=(char)('a'+i);
                    arr[i]--;
                    sum--;
                }
            }
        }
        return str;
    }

    public static String sortStringAlt1(String s) {
        if(s.length()<=1){
            return s;
        }
        char[] chars=s.toCharArray();
        Arrays.sort(chars);
        String str="";
        while(str.length()!=s.length()){
            char prev=(char)123;
            for(int i=0;i< chars.length;i++){
                if(chars[i]!=prev && chars[i]!='\u0000'){
                    str+=chars[i];
                    prev=chars[i];
                    chars[i]='\u0000';
                }
            }
            prev=(char)96;
            for(int i=chars.length-1;i>=0;i--){
                if(chars[i]!=prev && chars[i]!='\u0000' ){
                    str+=chars[i];
                    prev=chars[i];
                    chars[i]='\u0000';
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String s="aaaabbbbcccc";
        String s1="rat";
        String s2="leetcode";
        String s3="c";
        String s4="ggggggg";
        System.out.println(sortString(s));
        System.out.println(sortString(s1));
        System.out.println(sortString(s2));
        System.out.println(sortString(s3));
        System.out.println(sortString(s4));
    }
}
