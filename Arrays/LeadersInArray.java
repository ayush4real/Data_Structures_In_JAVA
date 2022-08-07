package Arrays;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] input = {13 ,17 ,5 ,4 ,6};
        int i=0;
        while(i+1< input.length-1){
            if(input[i]>input[i+1]){
                System.out.println(input[i]);
            }
            i++;
        }
        System.out.print(input[input.length-1]);
    }
}
