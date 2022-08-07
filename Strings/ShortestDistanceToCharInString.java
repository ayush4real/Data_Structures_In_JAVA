package Strings;

public class ShortestDistanceToCharInString {

    public static int[] shortestToCharOptimized1(String s, char c){
        int len=s.length();
        int[] arr=new int[len];
        int prev=len;
        for(int i=0;i<len;i++){
            if(s.charAt(i)==c){
                arr[i]=0;
                prev=0;
            }else{
                arr[i]=++prev;
            }
        }

        prev=len;
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)==c){
                arr[i]=0;
                prev=0;
            }else{
                arr[i]=Math.min(arr[i],++prev);
            }
        }
        return arr;
    }
    public static int[] shortestToChar(String s, char c) {
        int[] arr=new int[s.length()];

        for(int i=0;i<s.length();i++){
            int j=0,k=s.length()-1;
            int minI=Integer.MAX_VALUE;
            while (k>=j){
                if(s.charAt(j)==c){
                    if(Math.abs(i-j)<minI){
                        minI=Math.abs(i-j);
                        arr[i]=minI;
                    }
                }
                if(s.charAt(k)==c){
                    if(Math.abs(i-k)<minI){
                        minI=Math.abs(i-k);
                        arr[i]=minI;
                    }
                }
                j++;
                k--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        String s="loveleetcode";
        char c='e';
        int[] arr=shortestToCharOptimized1(s,c);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
