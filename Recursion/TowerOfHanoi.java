package Recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n,char s, char h, char d){
        if(n==0){
            return;
        }
        if(n==1){
            System.out.println("move "+n+" from "+s+" to "+d);
            return;
        }
        towerOfHanoi(n-1,s,d,h);
        System.out.println("move "+n+" from "+s+" to "+d);
        towerOfHanoi(n-1,h,s,d);
    }

    public static void main(String[] args) {
        int n=0;
        towerOfHanoi(n,'A','B','C');
    }
}
