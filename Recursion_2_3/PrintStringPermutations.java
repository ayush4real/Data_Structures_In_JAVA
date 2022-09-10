package Recursion_2_3;

public class PrintStringPermutations {

    public static void permutations(String s, String currStr){
        if(s.length()==0){
            System.out.println(currStr);
            return;
        }
        for(int i=0;i<s.length();i++){
            permutations(s.substring(0,i)+s.substring(i+1),currStr+s.charAt(i));
        }
    }

    public static void permutations(String input){
        permutations(input, "");
    }

    public static void main(String[] args) {
        String s="abc";
        permutations(s);
    }
}
