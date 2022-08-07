package Arrays;

public class TripletSum {
    public static void swapAlt(int[] arr, int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = {6 ,1 ,6 ,5, 3 ,2 ,5, 0 ,5, 6, 0};
        int n=5;
        swapAlt(arr, n);
    }
}
