package Recursion;

public class RecursionLastIndex {
    public static int lastIndex(int input[], int x){
        if(input[input.length-1]==x){
            return input.length-1;
        }
        if(input.length==1){
            return -1;
        }
        int[] arr=new int[input.length-1];
        for(int i=0;i< input.length-1;i++){
            arr[i]= input[i];
        }
        return lastIndex(arr,x);
    }

    public static int lastIndexAlt1(int input[], int x){
        if(input.length==0){
            return -1;
        }
        int[] arr=new int[input.length-1];
        for(int i=1;i< input.length;i++){
            arr[i-1]= input[i];
        }
        int k=lastIndexAlt1(arr,x);
        if(k!=-1){
            return k+1;
        }else {
            if(input[0]==x){
                return 0;
            }else {
                return -1;
            }
        }
    }

    public static int lastIndexAlt2(int input[], int x, int s){
        if(s==input.length){
            return -1;
        }
        int k= lastIndexAlt2(input,x,s+1);
        if(k!=-1){
            return k;
        }else {
            if(input[s]==x){
                return s;
            }else{
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,3,2,5};
        System.out.println(lastIndexAlt1(arr,7));
    }
}
