package TwoDArrays;

public class DiagonalsSum {
    public static void main(String[] args) {
        int[][] mat ={{5}};

        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=i;j==i;j++){
                sum+=mat[i][j];
                mat[i][j]=0;
            }
        }
        for(int i=mat.length-1;i>=0;i--){
            for(int j=mat.length-1-i;j==mat.length-1-i;j++){
                sum+=mat[i][j];
                mat[i][j]=0;
            }
        }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print((mat[i][j])+" ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
