package Recursion_2_3;

public class ReturnSubsetsOfArray {

    public static int[][] subsetsHelper(int input[],int index) {
        if(index==input.length){
            return new int[1][0];
        }
        int[][] arr1=subsetsHelper(input, index+1);
        int[][] arr2=new int[arr1.length*2][];
        for(int i=0;i<arr1.length;i++){
            arr2[i]=new int[arr1[i].length];
            for(int j=0;j<arr1[i].length;j++){
                arr2[i][j]=arr1[i][j];
            }
        }

        for(int i=0;i<arr1.length;i++){
            arr2[i+ arr1.length]=new int[arr1[i].length+1];
            arr2[i+ arr1.length][0]=input[index];
            for(int j=1;j<arr2[i+ arr1.length].length;j++){
                arr2[i+ arr1.length][j]=arr1[i][j-1];
            }
        }
        return arr2;
    }

    public static int[][] subsets(int input[]) {
        return subsetsHelper(input,0);
    }

    public static void main(String[] args) {
        int[] arr={15,20,12};
        int[][] arr2=subsets(arr);
        for(int[] i:arr2){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
