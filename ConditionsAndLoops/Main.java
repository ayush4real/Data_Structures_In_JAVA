package ConditionsAndLoops;

public class Main {
    public static void main(String[] args) {
        int s = 10000;
        if(s>=10000){
            s += 2000;
        } else if (s >=20000) {
            s+=3000;
        }else {
            s+=4000;
        }
        System.out.println(s);
    }
}
