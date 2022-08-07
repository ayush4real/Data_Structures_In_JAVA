package TwoDArrays;

public class TwoDArrayMaxColumnSum {
    public static void main(String[] args) {
        int[][] arr = {{4,5,3,2,6},{7,5,3,8,9}};
        int max=Integer.MIN_VALUE;
        for(int j=0;j<arr[0].length;j++){
            int sum=0;
            for (int i=0;i<arr.length;i++){
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }

        System.out.println(max);
    }
}
