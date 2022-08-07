package Strings;

public class MinLengthWordInString {
    public static void main(String[] args) {
        String str="abc d e";

        int min =Integer.MAX_VALUE;
        String least="";
        for(int i=0;i<str.length();){
            int count=0;
            int j=i;
            while(j<str.length() && str.charAt(j)!=' '){
                count++;
                j++;
            }
            if(count<min){
                min=count;
                least=str.substring(i,j);
            }
            i=j+1;
        }
        System.out.println(least);
    }
}
