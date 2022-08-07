package Strings;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharactersInStrings {

    public static List<String> commonCharsAlt(String[] words){
        List<String> list=new ArrayList<>();
        int[] chars=new int[26];
        for(char c: words[0].toCharArray()){
            chars[c-'a']++;
        }

        for(int i=1;i< words.length;i++){
            int[] chars2=new int[26];
            for(char c: words[i].toCharArray()){
                chars2[c-'a']++;
            }
            for(int j=0;j< chars.length;j++){
//                if(chars[j]==0 || chars2[j]==0){
//                    chars[j]=0;
//                }
//                if(chars[j]!=0 && chars2[j]!=0){
//                }
                chars[j]=Math.min(chars[j],chars2[j]);
            }
        }
        for(int i=0;i< chars.length;i++){
            if(chars[i]!=0){
                int j=0;
                while(j<chars[i]){
                    list.add(""+(char)(i+'a'));
                    j++;
                }
            }
        }
        return list;
    }

//    public static List<String> commonChars(String[] words) {
//        List<String> list=new ArrayList<>();
//        char[] ch=new char[26];
//        String s=words[0];
//
//        for (char c: s.toCharArray()){
//            for(int i=1;i< words.length;i++){
//                if(words[i].indexOf(c)!=-1 && ch[c-'a']==0){
//                    ch[c-'a']++;
//                }
//            }
//        }
//        for(int i=0;i<ch.length;i++){
//            if(ch[i]==1){
//                String str="";
//                list.add(str+(char)(i+'a'));
//            }
//        }
//        return list;
//    }

    public static void main(String[] args) {
        String[] words={"cool","lock","cook"};
        List<String> chars=commonCharsAlt(words);
        for(int i=0;i<chars.size();i++){
            System.out.println(chars.get(i));
        }
    }
}
