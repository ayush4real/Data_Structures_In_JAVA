package Classes;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        for(int i=1;i<5;i++){
            d.add(100+i);
        }

        System.out.println(d.size());
        System.out.println(d.get(98));

        System.out.println(d.get(4));
        d.set(3,10);
        System.out.println(d.get(4));
        while(!d.isEmpty()){
            System.out.println(d.removeLast());
            System.out.println("size -"+d.size());
        }
    }
}
