package Arrays;

public class ArrayEquilibriumIndex {

    public static int arrayEquilibriumIndex(int[] arr){
        if(arr.length<=2){
            return -1;
        }
        int ls=0;
        int rs=0;
        for(int i=0;i<arr.length;i++){
            rs+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(i>0){
                ls+=arr[i-1];
            }
            rs-=arr[i];
            if(ls==rs) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1, -1,1};
        System.out.println(arrayEquilibriumIndex(arr));
    }
}
