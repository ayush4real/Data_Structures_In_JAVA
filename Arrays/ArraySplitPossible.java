package Arrays;

public class ArraySplitPossible {

    public static boolean splitArray(int arr[], int s, int s1, int s2){
        if(s==arr.length){
            return s1==s2;
        }
        if(arr[s]%5==0){
            s1+=arr[s];
        } else if (arr[s]%3==0) {
            s2+=arr[s];
        }else{
            return (splitArray(arr,s+1,s1+arr[s],s2) || splitArray(arr,s+1,s1,s2+arr[s]));
        }
        return splitArray(arr,s+1,s1,s2);
    }

    public static boolean splitArray(int input[]){
        return splitArray(input,0,0,0);
    }

    public static void main(String[] args) {
        int[] arr={5,15,17,3};
        System.out.println(splitArray(arr));
//        System.out.println(splitArray(arr,0,0,0));
    }
}
