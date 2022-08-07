package Classes;

public class ComplexUse {
    public static void main(String[] args) {
        Complex c1=new Complex(10,15);
        c1.print();
        Complex c2=new Complex(12,-40);
        c2.print();
        c1.plus(c2);
        c1.print();
//        Complex c3= Complex.add(c1,c2);
//        c3.print();
//        c1.multiply(c2);
    }
}
