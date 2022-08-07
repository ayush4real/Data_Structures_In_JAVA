package Strings;

public class ReverseStringWordsOrder {
    public static void main(String[] args) {
        String str = "Welcome to Coding Ninjas";

        int i=str.length()-1;
        String str1="";
        while(i>=0){
            str1+=str.charAt(i);
            i--;
        }
        str=str1;

        i=0;
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
