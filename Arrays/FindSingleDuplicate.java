package Arrays;

public class FindSingleDuplicate {
    public static void swapAlt(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean dup = false;
            int j=0;
            while(j<i){
                if(arr[i]==arr[j]){
                    dup=true;
                    System.out.println(arr[i]);
                    return;
                }
                j++;
            }
            int k=i+1;
            while(k<arr.length){
                if(arr[k]==arr[j]){
                    dup=true;
                    System.out.println(arr[i]);
                    return;
                }
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,4,7,5};
        swapAlt(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
