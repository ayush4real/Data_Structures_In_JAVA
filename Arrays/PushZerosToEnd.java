package Arrays;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {9,0,0,8,2};
        int z=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                z=i;
                int j=i+1;
                while(j<arr.length){
                    if(arr[j]!=0){
                        int temp =arr[j];
                        arr[j]=arr[z];
                        arr[z]=temp;
                        break;
                    }
                    j++;
                }
            }
        }

        for(int a=0;a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }
    }
}
