package Classes;

import Exceptions.DivideByZeroException;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1= new Fraction(4,6);
//        f1.print();
//        f1.increment();
//        f1.print();
        Fraction f2 = new Fraction(4,8);
//        f1.addFractions(f2);
//        Fraction f3= Fraction.addFractions(f1,f2);
//        f3.print();
//        f1.subtract(f2);
        f1.multiply(f2);
        f1.print();
    }
}
