package Arrays;

public class SumOfAllOddLengthSubArrays {
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3};

        int sum=0;

        for(int w=1;w<=arr.length;w+=2){
            for(int i=0;i+w<=arr.length;i++){
                for(int j=i;j<i+w;j++){
                    sum+=arr[j];
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        System.out.println(sum);
    }
}
