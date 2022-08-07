package Strings;

public class ReverseStringWordsCharsAlt2 {

    public static String reverseWords(String str) {
        int index=str.indexOf(" ");
        String s1="";
        if(index>=0){
            for(int i=0;i<index;i++){
                s1=str.charAt(i)+s1;
            }
            s1+=" "+reverseWords(str.substring(index+1));
        }else{
            for(int i=0;i<str.length();i++){
                s1=str.charAt(i)+s1;
            }
        }
        return s1;
    }

    public static void main(String[] args) {
        String s="God Ding";
        System.out.println(reverseWords(s));
    }
}
