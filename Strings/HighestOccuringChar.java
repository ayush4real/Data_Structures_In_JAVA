package Strings;

public class HighestOccuringChar {
    public static void main(String[] args) {
        int[] arr= new int[256];
        String str="abdefgbabfba";

        for(int i=0;i<str.length();i++){
            int val= str.charAt(i);
            arr[val]++;
//            System.out.println(val);
        }
        int max=0;
        int i=0;
        for(;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        int val=arr[max];
        for(int j=0;j<str.length();j++){
            if(arr[str.charAt(j)]==val){
                System.out.println(str.charAt(j));
                return;
            }
        }
    }
}
