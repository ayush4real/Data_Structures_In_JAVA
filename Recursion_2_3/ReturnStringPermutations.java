package Recursion_2_3;

public class ReturnStringPermutations {

    public static String[] permutationHelper(String s){
        if(s.length()==0){
            return new String[]{};
        }
        if(s.length()==1){
            return new String[]{s};
        }
        String[] arr1=permutationHelper(s.substring(1));
        String[] arr2=new String[arr1.length*s.length()];
        int k=0;
        for (String str : arr1) {
            for (int j = 0; j < str.length() + 1; j++) {
                arr2[k] = str.substring(0, j) + s.charAt(0) + str.substring(j);
                k++;
            }
        }
        return arr2;
    }

    public static String[] permutationOfString(String input){
        return permutationHelper(input);
    }

    public static void main(String[] args) {
        String s="abc";
        String[] arr=permutationOfString(s);
        for(String str:arr){
            System.out.println(str);
        }
    }
}
