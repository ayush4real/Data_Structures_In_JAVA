package TwoDArrays;

public class TwoDArrayMaxRowORColSum {
    public static void main(String[] args) {
        int[][] mat = {};
        String dir="row";
        int col=0;
        int max_C=Integer.MIN_VALUE;

        if(mat.length==0){
            System.out.print(dir+" "+0+" "+max_C);
            return;
        }

        for(int j=0;j<mat[0].length;j++){
            int sum=0;
            for (int i=0;i<mat.length;i++){
                sum+=mat[i][j];
            }
            if(sum>max_C){
                max_C=sum;
                col=j;
            }
        }

        int max_R= Integer.MIN_VALUE;
        int row=0;
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for (int j=0;j<mat[0].length;j++){
                sum+=mat[i][j];
            }
            if(sum>max_R){
                max_R=sum;
                row=i;
            }
        }
        if(max_C<=max_R){
            System.out.println(dir+" "+row+" "+max_R);
        }
        else if(max_C>max_R){
            dir="column";
            System.out.println(dir+" "+col+" "+max_C);
        }
    }
}
