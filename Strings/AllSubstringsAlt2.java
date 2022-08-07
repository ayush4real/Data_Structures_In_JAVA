package Strings;

public class AllSubstringsAlt2 {
    public static void main(String[] args) {
        String str="pqrs";
        int k=1;
        while(k<=str.length()){
            int i=0;
            while(i<=str.length()-k){
                int j=i+k-1;
                System.out.print(str.substring(i, j+1)+" ");
                i++;
            }
            k++;
        }
    }
}
