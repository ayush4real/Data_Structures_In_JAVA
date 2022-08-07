package Strings;

public class CompressString {
    public static void main(String[] args) {
        String str="aabccbdeef";
        String ans="";
        for(int i=0;i<str.length();){
            int j=i;
            int count=0;
            while(j<str.length() && str.charAt(j)==str.charAt(i)){
                count++;
                j++;
            }
            ans+=str.charAt(i);
            if(count>1){
                ans+=(count);
            }
            i=j;
        }
        System.out.println(ans);
    }
}
