package TwoDArrays;

public class TwoDArrayRowSum {
    public static void main(String[] args) {
        int[][] arr = {{4,5,3,2,6},{7,5,3,8,9}};

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            System.out.print(sum+" ");
        }
    }
}
