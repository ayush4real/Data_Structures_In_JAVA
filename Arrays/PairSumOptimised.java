package Arrays;

public class PairSumOptimised {

    public static int pairSum(int[] arr, int num) {
        quickSort(arr,0,arr.length-1);
        int count=0;
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            while(j<arr.length){
                if (arr[i]+arr[j]==num) count++;
                j++;
            }
        }
        return count;
//        while(i<j){
//            if(arr[i]+arr[j]==num){
//                count++;
//                i++;
//            } else if (arr[i]+arr[j]<num) {
//                i++;
//            } else {
//                j--;
//            }
//        }
//        return count;
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
        int[] arr={3,3,3,3,3};
        System.out.println(pairSum(arr,6));
    }
}
