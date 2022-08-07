package Classes;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public void plus(Complex c2){
        this.real=this.real+c2.real;
        this.imaginary=this.imaginary+c2.imaginary;
//        this.print();
    }

    public static Complex plus(Complex c1,Complex c2){
        int real;
        int imaginary;
        real=c1.real+c2.real;
        imaginary=c1.imaginary+c2.imaginary;
        Complex c3= new Complex(real, imaginary);
        return c3;
    }

    public void multiply(Complex c2){
        int real=(this.real*c2.real)-(this.imaginary*c2.imaginary);
        int imaginary=(this.real*c2.imaginary)+(this.imaginary*c2.real);
        this.real=real;
        this.imaginary=imaginary;
//        this.print();
    }

    public void print(){
        if(this.imaginary>=0){
            System.out.println(this.real+"+i"+this.imaginary);
        }else {
            System.out.println(this.real+"-i"+Math.abs(this.imaginary));
        }
    }
}
