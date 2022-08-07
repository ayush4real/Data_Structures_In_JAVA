package Arrays;

public class FindOnlyDuplicate {

    public static int findDuplicate(int[] arr) {
        int[] arr2=new int[arr.length-1];

        for(int i=0;i<arr.length;i++){
            arr2[arr[i]]++;
            if(arr2[arr[i]]>1) return arr[i];
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] arr={0 ,3 ,1 ,5 ,4 ,3 ,2};
        System.out.println(findDuplicate(arr));
    }
}
