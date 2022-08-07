package Strings;

public class CountGoodSubstringsOfLen3 {

    public static int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i+2<s.length();i++){
            String str=s.substring(i,i+3);
            count++;
            char[] ch=new char[26];
            for(char c: str.toCharArray()){
                ch[c-'a']++;
                if(ch[c-'a']>1){
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s="aababcabc";
        System.out.println(countGoodSubstrings(s));
    }
}
