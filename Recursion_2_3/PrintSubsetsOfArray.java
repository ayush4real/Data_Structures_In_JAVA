package Recursion_2_3;

public class PrintSubsetsOfArray {

    public static void printSubsets(int arr1[], int[] arr2,int index) {
        if(index== arr1.length){
            for(int i: arr2){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        int[] nextArr=new int[arr2.length+1];
        nextArr[nextArr.length-1]=arr1[index];
        for(int i=0;i< arr2.length;i++){
            nextArr[i]=arr2[i];
        }
        printSubsets(arr1,nextArr,index+1);
        printSubsets(arr1,arr2,index+1);
    }

    public static void printSubsets(int input[]){
        printSubsets(input,new int[]{},0);
    }

    public static void main(String[] args) {
        int[] arr={15,20,12};
        printSubsets(arr);
    }
}
