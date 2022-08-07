package TwoDArrays;

public class TestTwoDArrays {
    public static void main(String[] args) {
        int[][] input= {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<input.length;i++){
            int k= input.length-i;
            while(k>=1){
                for(int j=0;j<input[i].length;j++){
                    System.out.print(input[i][j]+" ");
                }
                System.out.println();
                k--;
            }
        }
    }
}
