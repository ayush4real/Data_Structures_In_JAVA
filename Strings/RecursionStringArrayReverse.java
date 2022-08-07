package Strings;

public class RecursionStringArrayReverse {

    public static void reverseString(char[] s) {
        if(s.length==1) return;
        reverseString(s,0,s.length-1);
    }

    public static void reverseString(char[] arr,int s, int e) {
        if(s==e){
            return;
        }
        char temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        reverseString(arr,s+1,e-1);
    }

    public static void main(String[] args) {
        char[] arr={'h','e','l','l','o'};
        reverseString(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
