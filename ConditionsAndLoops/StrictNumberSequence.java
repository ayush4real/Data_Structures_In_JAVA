package ConditionsAndLoops;

import java.util.Scanner;

public class StrictNumberSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int prev =s.nextInt();
        int i=2;
        boolean isDec=true;
        while(i<=n){
            int curr = s.nextInt();
            if(curr==prev){
                System.out.println(false);
                return;
            } else if (curr<prev) {
                if(isDec==false){
                    System.out.print(false);
                    return;
                }
            } else if (curr>prev) {
                isDec=false;
            }
            prev=curr;
            i++;
        }
        System.out.println(true);
    }
}
