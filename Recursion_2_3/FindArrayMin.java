package Recursion_2_3;

public class FindArrayMin {

    public static int arrayMin(int[] arr,int index){
        if(index==arr.length){
            return Integer.MAX_VALUE;
        }
        int min=arrayMin(arr,index+1);
        return Math.min(arr[index], min);
    }

    public static void arrayMin(int[] arr,int index,int min){
        if(index==arr.length){
            System.out.println(min);
            return;
        }
        int currMin=Math.min(arr[index],min);
        arrayMin(arr,index+1,currMin);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arrayMin(arr,0));
        arrayMin(arr,0,Integer.MAX_VALUE);
    }
}
