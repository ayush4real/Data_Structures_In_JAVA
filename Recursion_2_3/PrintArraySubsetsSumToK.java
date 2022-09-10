package Recursion_2_3;

public class PrintArraySubsetsSumToK {

    public static void printSubsetsSumTok(int arr[], int index, int[] currSet,int k) {
        if(index== arr.length){
            if(k==0){
                for(int i: currSet){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            return;
        }
        int[] newArr=new int[currSet.length+1];
        newArr[currSet.length]=arr[index];
        for(int i=0;i< currSet.length;i++){
            newArr[i]=currSet[i];
        }
        printSubsetsSumTok(arr,index+1,newArr,k-arr[index]);
        printSubsetsSumTok(arr,index+1,currSet,k);
    }

    public static void printSubsetsSumTok(int input[], int k) {
        printSubsetsSumTok(input,0,new int[]{},k);
    }

    public static void main(String[] args) {
        int[] arr={3,2,5,1,4,6};
        printSubsetsSumTok(arr,8);
    }
}
