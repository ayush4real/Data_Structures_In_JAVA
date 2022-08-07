package Arrays;

public class ArrayIntersection2 {

    public static void intersection(int[] arr1, int[] arr2) {
        if(arr1.length==0 || arr2.length==0){
            System.out.println();
            return;
        } else if (arr1.length>=1 && arr2.length==0) {
            System.out.println();
            return;
        } else if (arr1.length==0 && arr2.length>=1) {
            System.out.println();
            return;
        }else{
            int s1=0,s2=0;
            int e1= arr1.length-1,e2= arr2.length-1;
            quickSort(arr1,s1,e1);
            quickSort(arr2,s2,e2);

            int i=0;
            int j=0;
            while(j<arr2.length && i<arr1.length){
                if(arr1[i]<arr2[j]){
                    i++;
                }else if(arr1[i]>arr2[j]){
                    j++;
                }else{
                    System.out.print(arr1[i]+" ");
//                    arr2[j]=Integer.MIN_VALUE;
                    i++;
                    j++;
                }
            }
        }
    }

    public static void quickSort(int[] arr,int s, int e){
        if(s<e){
            int index= partition(arr,s,e);
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
            } else if (arr[j]>=arr[index]) {
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
        int[] arr1={22,66, 88, 110, 188, 266};
        int[] arr2={33, 77,99 ,133 ,200};
        intersection(arr1,arr2);
    }
}
