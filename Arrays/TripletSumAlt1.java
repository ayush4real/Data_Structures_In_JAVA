package Arrays;

import java.util.Arrays;

public class TripletSumAlt1 {
    public static int tripletSum(int[] arr, int num) {
        Arrays.sort(arr);
        int n = arr.length;

        int numTriplets = 0;

        for (int i=0; i<n; i++) {
            int pairSum = num - arr[i];
            int numPairs = 0;

            int start = i + 1;
            int stop = n - 1;

            while (start < stop) {
                if (arr[start] + arr[stop] < pairSum) {
                    start++;
                } else if (arr[start] + arr[stop] > pairSum) {
                    stop--;
                } else {
                    if (arr[start] == arr[stop]) {
                        int totalCount = (stop - start) + 1;
                        numPairs += (totalCount * (totalCount - 1) / 2);
                        break;
                    }

                    int tempI = start + 1;
                    int tempJ = stop - 1;

                    while (tempI <= tempJ && arr[start] == arr[tempI]) {
                        tempI++;
                    }

                    while (tempI <= tempJ && arr[stop] == arr[tempJ]) {
                        tempJ--;
                    }

                    int totalElementFromStart = (tempI - start);
                    int totalElementFromEnd = stop - tempJ;

                    numPairs += (totalElementFromStart * totalElementFromEnd);

                    start = tempI;
                    stop = tempJ;
                }
            }
            numTriplets += numPairs;
        }
        return numTriplets;
    }

    public static void quickSort(int[] arr,int s, int e){
        if (s < e) {
            int index=partition(arr,s,e);
            quickSort(arr,s,index-1);
            quickSort(arr,index+1,e);
        }
    }

    private static int partition(int[] arr, int s, int e) {
        int p=(s+e)/2;
        int count=0;
        for(int i=s;i<=e;i++){
            if(arr[i]<arr[p]){
                count++;
            }
        }
        int index=s+count;
        int temp=arr[p];
        arr[p]=arr[index];
        arr[index]=temp;

        int i=s,j=e;
        while(i<j){
            if(arr[i]<arr[index]){
                i++;
            }else if(arr[j]>=arr[index]){
                j--;
            }else{
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr={6 ,1, 6 ,5 ,3 ,2 ,6 };
        System.out.println(tripletSum(arr,6));
    }
}
