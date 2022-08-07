package Strings;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "abbabccecc";

        String str1="";
        int i=0;
        while(i<str.length()){
            int j=i+1;
            str1+=str.charAt(i);
            while(j<str.length() && str.charAt(j)==str.charAt(i)){
                j++;
            }
            i=j;
        }
        System.out.println(str1);
    }
}
