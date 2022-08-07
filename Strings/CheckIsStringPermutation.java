package Strings;

public class CheckIsStringPermutation {
    public static void main(String[] args) {
        String str1 = "abb";
        String str2="baa";

        if(str1.length()!=str2.length()){
            System.out.println(false);
            return;
        }
        int[] arr= new int[256];
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++){
            arr[str2.charAt(i)]--;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
