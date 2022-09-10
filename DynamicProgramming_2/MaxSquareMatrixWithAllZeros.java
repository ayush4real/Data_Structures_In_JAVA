package DynamicProgramming_2;

public class MaxSquareMatrixWithAllZeros {

    public static int findMaxSquareWithAllZeros(int[][] input){
        if(input.length==0){
            return 0;
        }
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[0].length;j++){
                if(input[i][j]==1){
                    input[i][j]=0;
                }else{
                    input[i][j]=1;
                }
            }
        }
        int[][] newMatrix=new int[input.length][input[0].length];
        for(int i=0;i<input.length;i++){
            newMatrix[i][0]=input[i][0];
        }
        for(int i=0;i<input[0].length;i++){
            newMatrix[0][i]=input[0][i];
        }
        for(int i=1;i<input.length;i++){
            for(int j=1;j<input[0].length;j++){
                if(input[i][j]==1){
                    newMatrix[i][j]=Math.min(newMatrix[i-1][j-1],Math.min(newMatrix[i-1][j],newMatrix[i][j-1])) +1;
                }else{
                    newMatrix[i][j]=0;
                }
            }
        }
        int maxVal=newMatrix[0][0];
        int row=0,col=0;
        for(int i=0;i<newMatrix.length;i++){
            for(int j=0;j<newMatrix[0].length;j++){
                if(newMatrix[i][j]>maxVal){
                    maxVal=newMatrix[i][j];
                    row=i;
                    col=j;
                }
            }
        }
        System.out.println(row+" "+col);
        for(int i=row;i>row-maxVal;i--){
            for(int j=col;j>col-maxVal;j--){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[][] input={{0,0,0},{0,0,0},{0,0,0}};
        System.out.println(findMaxSquareWithAllZeros(input));
    }
}
