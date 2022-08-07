package Arrays;

public class CheckArrayRotation {
    public static void main(String[] args) {
        int i=1;
        int[] arr={5,6,1,2,3,4};
        while(i<arr.length && arr[i]>arr[i-1]){
            i++;
        }
        if(i>=arr.length){
            System.out.println(0);
            return;
        }
        System.out.println(i);
    }
}
