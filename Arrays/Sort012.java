package Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr= {1,0,2,1,0,1,2,0};

        int nz=0;
        int nt =arr.length-1;
        int i=0;
        while(i<=nt){
            if(arr[i]==1){
                i++;
            } else if(arr[i]==0){
                int temp =arr[i];
                arr[i]=arr[nz];
                arr[nz]=temp;
                i++;
                nz++;
            } else if (arr[i]==2) {
                int temp =arr[i];
                arr[i]=arr[nt];
                arr[nt]=temp;
                nt--;
            }
        }

        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
