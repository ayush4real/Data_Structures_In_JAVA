package TwoDArrays;

public class PrintTwoDArraySpiral {
    public static void main(String[] args) {
//        int matrix[][] = {
//                {1,2,3,4,5},
//                {6,7,8,9,10},
//                {11,12,13,14,15},
//                {16,17,18,19,20},
//                {21,22,23,24,25}
//        };
        int matrix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
        };

        if(matrix.length==0){
            return;
        }

        int rs=0,cs=0,e=0;
        int re=matrix.length-1,ce=matrix[0].length-1;
        while(e<(matrix.length*matrix[0].length)){
            int j=cs;
            while(j<=ce){
                System.out.print(matrix[rs][j]+" ");
                e++;
                j++;
            }
            int i=rs+1;
            while(i<=re){
                System.out.print(matrix[i][ce]+" ");
                e++;
                i++;
            }
            j=ce-1;
            while(j>=cs){
                System.out.print(matrix[re][j]+" ");
                e++;
                j--;
            }
            i=re-1;
            while(i>=rs+1){
                System.out.print(matrix[i][cs]+" ");
                e++;
                i--;
            }
            cs++;
            rs++;
            re--;
            ce--;
        }
    }
}
