package Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr1= {6,2,4};
        int[] arr2= {7,5,6};

        int carry=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int s=Math.max(arr1.length, arr2.length);
        int k=Math.max(arr1.length, arr2.length);
        int[] output= new int[s+1];

        while(i>=0 && j>=0){
            int sum=arr1[i]+arr2[j];
            if(carry>0){
                sum+=carry;
                carry=0;
            }
            output[k]=sum%10;
            carry=sum/10;
            i--;
            j--;
            k--;
        }
        while(i>=0){
            int sum=arr1[i]+carry;
            carry=0;
            output[k]=sum%10;
            carry=sum/10;
            i--;
            k--;
        }
        while(j>=0){
            int sum=arr2[j]+carry;
            carry=0;
            output[k]=sum%10;
            carry=sum/10;
            j--;
            k--;
        }
        output[0]=carry;

        for(int m=0;m<output.length;m++){
            System.out.print(output[m]+" ");
        }
    }
}
