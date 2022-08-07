package Strings;

public class AllSubstrings {
    public static void main(String[] args) {
        String str="pqrs";
        int k=1;
        while(k<=str.length()){
            int i=0;
            while(i<=str.length()-k){
                int j=i;
                String sub="";
                while(j<i+k){
                    sub+=str.charAt(j);
                    j++;
                }
                System.out.print(sub+" ");
                i++;
            }
            k++;
        }
    }
}
