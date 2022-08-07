package Arrays;

public class FindSingleUnique {

    public static int findUnique(int[] arr) {
        quickSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0;i+1<arr.length;i+=2){
            if(arr[i]!=arr[i+1]) return arr[i];
        }
        return arr[arr.length-1];
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
        int[] arr={2 ,3 ,1 ,6 ,3 ,6 ,2};
        System.out.println(findUnique(arr));
    }
}
