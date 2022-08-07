package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp =arr[i];
            while(j>=0 && arr[j]<temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        int j=0;
        int i=1;
        while(i<arr.length){
            if(arr[i]<arr[j]){
                System.out.println(arr[i]);
                return;
            }
            i++;
        }
        System.out.println("not found");
    }
}
