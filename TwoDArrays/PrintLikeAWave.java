package TwoDArrays;

public class PrintLikeAWave {
    public static void main(String[] args) {
        int mat[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        if(mat.length==0){
            return;
        }
        int j=0;
        while(j<mat[0].length){
            if(j%2==0){
                for(int i=0;i<mat.length;i++){
                    System.out.print(mat[i][j]+" ");
                }
            }else{
                for(int i=mat.length-1;i>=0;i--){
                    System.out.print(mat[i][j]+" ");
                }
            }
            j++;
        }
    }
}
