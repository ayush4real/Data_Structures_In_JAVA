package Arrays;

public class NUniqueIntegersWithSum0 {

    public static int[] sumZero(int n){
        int[] arr=new int[n];
        int i=0,j=n-1;
//        while(i<n/2){
//            arr[i]=-n+i;
//            arr[i+1]=n-i;
//            i+=2;
//        }
//        arr[i]=0;
//        return arr;
        while(i<j){
            arr[i]=-n;
            arr[j]=n;
            n--;
            j--;
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int n=0;
        int[] arr=sumZero(n);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
