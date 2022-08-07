package Classes;

import Exceptions.DivideByZeroException;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if(denominator==0){
            denominator=1;
        }
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }

    private void simplify() {
//        System.out.println(this);
        int gcd =1;

        int smaller=Math.min(this.numerator,this.denominator);
        for(int i=smaller;i>=2;i--){
            if(this.numerator%i==0 && this.denominator%i==0){
                gcd=i;
                break;
            }
        }
        this.numerator=this.numerator/gcd;
        this.denominator=this.denominator/gcd;
    }

    public void increment(){
//        System.out.println(this);
        this.numerator=this.numerator+this.denominator;
        simplify();
    }

    public void addFractions(Fraction obj){
        if(this.denominator==obj.denominator){
            this.numerator=this.numerator+obj.numerator;
            this.simplify();
            this.print();
        }else if(this.denominator!=obj.denominator){
            this.numerator=(this.numerator*obj.denominator)+(obj.numerator*this.denominator);
            this.denominator=this.denominator*obj.denominator;
//            System.out.println(numerator+"/"+denominator)
            this.simplify();
//            this.print();
        }
    }

    public static Fraction addFractions(Fraction f1, Fraction f2) throws DivideByZeroException {
//        int num=0;
//        int den=0;
//        if(f1.denominator==f2.denominator){
//            num=f1.numerator+f2.numerator;
//            den=f1.denominator;
//        }else if(f1.denominator!=f2.denominator){
//            num=(f1.numerator*f2.denominator)+(f1.numerator*f2.denominator);
//            den=f1.denominator*f2.denominator;
//        }
//        Fraction f3= new Fraction(num,den);
//        return f3;
        int newNum = f1.numerator*f2.denominator+f1.denominator*f2.numerator;
        int newDen = f1.denominator*f2.denominator;
        Fraction f3=new Fraction(newNum, newDen);
        return f3;
    }

    public void subtract(Fraction obj){
        if(this.denominator==obj.denominator){
            this.numerator=this.numerator-obj.numerator;
            this.simplify();
            this.print();
        }else if(this.denominator!=obj.denominator){
            this.numerator=(this.numerator*obj.denominator)-(obj.numerator*this.denominator);
            this.denominator=this.denominator*obj.denominator;
//            System.out.println(numerator+"/"+denominator)
            this.simplify();
            this.print();
        }
    }

    public void multiply(Fraction obj){
        this.numerator=this.numerator*obj.numerator;
        this.denominator=this.denominator*obj.denominator;
        this.simplify();
        this.print();
    }

    public void setNumerator(int num){
        this.numerator=num;
        simplify();
    }

    public void setDenominator(int den) throws DivideByZeroException {
        if(den==0){
            throw new DivideByZeroException();
        }
        this.denominator=den;
        simplify();
    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public void print(){
        System.out.println(this.numerator+"/"+this.denominator);
    }


}
