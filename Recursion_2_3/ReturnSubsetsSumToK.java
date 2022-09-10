package Recursion_2_3;

public class ReturnSubsetsSumToK {

    public static int[][] subsetsSumKHelper(int input[], int index ,int k) {
        if(index==input.length){
            if(k==0){
                return new int[1][0];
            }else{
                return new int[0][0];
            }
        }
        int[][] arr1=subsetsSumKHelper(input, index+1, k-input[index]);
        int[][] arr2=subsetsSumKHelper(input, index+1, k);
        int[][] arr3=new int[arr1.length+ arr2.length][];

        for(int i=0;i< arr2.length;i++){
            arr3[i]=new int[arr2[i].length];
            for(int j=0;j< arr2[i].length;j++){
                arr3[i][j]=arr2[i][j];
            }
        }

        for(int i=0;i< arr1.length;i++){
            arr3[i+ arr2.length]=new int[arr1[i].length+1];
            arr3[i+ arr2.length][0]= input[index];

            for(int j=1;j<arr3[i+ arr2.length].length;j++){
                arr3[i+ arr2.length][j]=arr1[i][j-1];
            }
        }
        return arr3;
    }

    public static int[][] subsetsSumK(int input[], int k) {
        return subsetsSumKHelper(input,0,k);
    }

    public static void main(String[] args) {

    }
}
