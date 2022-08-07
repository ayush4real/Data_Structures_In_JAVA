package TwoDArrays;

public class FindTwoDArraySidesAndDiagSum {
    public static void main(String[] args) {
//        int mat[][] = {
//                {1,2,3,4,5},
//                {6,7,8,9,10},
//                {11,12,13,14,15},
//                {16,17,18,19,20},
//                {21,22,23,24,25}
//        };

        int mat[][] = {};

        if(mat.length==0){
            System.out.println(0);
            return;
        }

        int sum=0;
        for(int i=0;i<mat.length;i++){
            if(i==0 || i==mat.length-1){
                for (int j=0;j<mat.length;j++){
                    sum+=mat[i][j];
                    mat[i][j]=0;
                }
            }else {
                for(int j=0;j<mat[i].length;j++){
                    if(j==0 || j==mat[i].length-1){
                        sum+=mat[i][j];
                        mat[i][j]=0;
                    }
                }
            }
        }

        int i=0,j=0;
        while(i<mat.length){
            sum+=mat[i][j];
            mat[i][j]=0;
            i++;
            j++;
        }

        i=0;
        j=mat[i].length-1;

        while(j>=0){
            sum+=mat[i][j];
            mat[i][j]=0;
            i++;
            j--;
        }

        System.out.println(sum);
    }
}
