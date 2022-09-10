package Recursion_2_3;

public class MinimumNumberOfChocolates {

    public static int getMin(int arr[], int N){
        int[] chocolates=new int[N];
        for(int i=0;i<N;i++){
            if(i==0){
                chocolates[i]=1;
                continue;
            }
            if(arr[i]>arr[i-1]){
                chocolates[i]=chocolates[i-1]+1;
            }else{
                chocolates[i]=1;
            }
        }

        for(int i=N-1;i>=0;i--){
            if(i==N-1){
                chocolates[i]=Math.max(1,chocolates[i]);
                continue;
            }
            if(arr[i]>arr[i+1]){
                chocolates[i]=Math.max(chocolates[i+1]+1,chocolates[i]);
            }else{
                chocolates[i]=Math.max(chocolates[i],1);
            }
        }
        int sum=0;
        for(int i:chocolates){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={8,7,5};
        System.out.println(getMin(arr,3));
    }
}
