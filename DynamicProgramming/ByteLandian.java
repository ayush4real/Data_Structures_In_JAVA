package DynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class ByteLandian {

    public static long bytelandian(long n) {
        if(n<=4){
            return n;
        }
        long ans=n;
        long ans1=bytelandian(n/2);
        long ans2=bytelandian(n/3);
        long ans3=bytelandian(n/4);
        return Math.max(ans,(ans1+ans2+ans3));
    }

    public static long bytelandian_1(long n, HashMap<Long,Long> hm){
        if(n<=4){
            return n;
        }
        long ans1,ans2,ans3;
        if(!hm.containsKey(n/2)){
            ans1=bytelandian_1(n/2,hm);
            hm.put(n/2,ans1);
        }else{
            ans1=hm.get(n/2);
        }
        if(!hm.containsKey(n/3)){
            ans2=bytelandian_1(n/3,hm);
            hm.put(n/3,ans2);
        }else{
            ans2=hm.get(n/3);
        }
        if(!hm.containsKey(n/4)){
            ans3=bytelandian_1(n/4,hm);
            hm.put(n/4,ans3);
        }else{
            ans3=hm.get(n/4);
        }
        return Math.max(n,(ans1+ans2+ans3));
    }

    public static long bytelandian_2(long n){
        HashMap<Long,Long> hm=new HashMap<>();
        hm.put(0L,0L);
        hm.put(1L,1L);
        hm.put(2L,2L);
        hm.put(3L,3L);
        hm.put(4L,4L);

//        for(long i=1;i<=n;i++){
//            long ans=0L;
//            for(int j=2;j<=4;j++){
//                ans+=hm.get(i/j);
//            }
//            hm.put(i,Math.max(i,ans));
//        }

        for(long i=5;i<=n;i++){
            long ans=hm.get(i/2)+hm.get(i/3)+hm.get(i/4);
            hm.put(i, Math.max(hm.getOrDefault(i, i), ans));
        }
        return hm.get(n);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        HashMap<Long,Long> hm=new HashMap<>();
        hm.put(0L,0L);
        hm.put(1L,1L);
        hm.put(2L,2L);
        hm.put(3L,3L);
        hm.put(4L,4L);
//        System.out.println(bytelandian_1(6,hm));
        System.out.println(bytelandian_2(n));
    }
}
