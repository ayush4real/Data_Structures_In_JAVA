package Generics;

public class PairUse {
    public static void main(String[] args) {
        int i=10;
        Integer i1=10;

        Pair<Integer, String> p=new Pair<>();

        Pair<Integer, String> p1=new Pair<Integer, String>(10,"hello");

        Pair<String,Integer> pInner=new Pair<String, Integer>("ab",100);
        Pair<Pair<String,Integer>,String> p2 = new Pair<>();
        p2.setFirst(pInner);
        p2.setSecond("abc");
        System.out.println(p2.getFirst().getFirst());
//        System.out.println(p2.getSecond());


//        Pair<String> ps=new Pair<String>("Aa", "Bb");

//        System.out.println(p1.getFirst()+" "+p1.getSecond());
//        System.out.println(ps.getFirst()+" "+ps.getSecond());

//        Pair<Vehicle> pv=new Pair<Vehicle>(new Vehicle(),new Vehicle());
    }
}
