package Strings;

public class ReverseStringWordChars {
    public static void main(String[] args) {
        String str = "abc def ghi";

        int i=0;
        String rev="";
        while(i<str.length()){
            int j=i;
            while(j<str.length() && str.charAt(j)!=' '){
                j++;
            }
            int k=j-1;
            while(k>=i){
                rev+=str.charAt(k);
                k--;
            }
            rev+=" ";
            i=j+1;
        }
        System.out.println(rev.substring(0,rev.length()-1));
    }
}
