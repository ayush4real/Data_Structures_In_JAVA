package Arrays;

public class GoodTriplet {
    public static void main(String[] args) {
        int[] arr={3,0,1,1,9,7};
        int a=7;
        int b=2;
        int c=3;
        int triplets=0;

        for(int i=0;i<arr.length-2;i++){
            for (int j=i+1;j<arr.length-1;j++){
                if(Math.abs(arr[i]-arr[j])<=a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            triplets++;
                        }
                    }
                }
            }
        }
        System.out.println(triplets);
    }
}
