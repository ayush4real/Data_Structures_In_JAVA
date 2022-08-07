package Arrays;

import java.util.Arrays;

public class MinNumOfMovesToSeatEveryone {
    public static void main(String[] args) {
        int[] seats={3,1,5};
        int[] students={2,7,4};

        int count=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<seats.length;i++){
            if(students[i]!=seats[i]){
                if(seats[i]>students[i]){
                    int k=seats[i];
                    while(k>students[i]){
                        count++;
                        k--;
                    }
                }else {
                    int k=students[i];
                    while(k>seats[i]){
                        count++;
                        k--;
                    }
                }
            }else {
                continue;
            }
        }
        System.out.println(count);
    }
}
