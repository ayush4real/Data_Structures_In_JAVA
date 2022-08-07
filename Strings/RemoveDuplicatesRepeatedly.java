package Strings;

import javax.script.ScriptEngine;

public class RemoveDuplicatesRepeatedly {

    public static String removeDuplicates(String s){
        StringBuilder sb=new StringBuilder();
        for(char c: s.toCharArray()){
            int size=sb.length();
            if(size>0 && sb.charAt(size-1)==c){
                sb.deleteCharAt(size-1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

//    public static String removeDuplicates(String s) {
//        if(s.length()<=1){
//            return s;
//        }
//        if(s.length()==2 && s.charAt(0)!=s.charAt(1)){
//            return s;
//        }
//        if(s.length()==2 && s.charAt(0)==s.charAt(1)){
//            return "";
//        }
//        String str="";
//        if(s.charAt(0)!=s.charAt(1)){
//            str=s.charAt(0)+removeDuplicates(s.substring(1));
//            if(str.length()>1){
//                if(str.charAt(0)==str.charAt(1)){
//                    str=removeDuplicates(str);
//                }
//            }
//            return str;
//        }else{
//            return removeDuplicates(s.substring(2));
//        }
//    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("bbb"));
//
    }
}
