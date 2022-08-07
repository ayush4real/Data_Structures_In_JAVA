package Strings;

public class ReverseStringWordCharsAlt1 {
    public static void main(String[] args) {
        String str="abc def ghi";
        String ans="";
        int cwStart=0;
        int i=0;
        for(;i<str.length();i++){
            String rev="";
            if(str.charAt(i)==' '){
                int cwEnd=i-1;
                for(int j=cwStart;j<=cwEnd;j++){
                    rev=str.charAt(j)+rev;
                }
                ans+=rev +" ";
                cwStart=i+1;
            }
        }

        String rev="";
        while(cwStart<i){
            rev=str.charAt(cwStart)+rev;
            cwStart++;
        }
        ans+=rev;

        System.out.println(ans);
    }
}
