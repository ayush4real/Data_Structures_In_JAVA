package Arrays;

public class ArrayIntersection {
    public static void swapAlt(int[] arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,4,7,5};
        int[] arr2 = {1,1,6,8,7,5};
        swapAlt(arr1, arr2);
    }
}
