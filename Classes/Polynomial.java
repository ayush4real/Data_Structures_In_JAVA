package Classes;

public class Polynomial {

    private int[] poly;
    private int maxDeg;

    public Polynomial(){
        poly= new int[10];
        maxDeg=0;
    }

    public Polynomial(int deg){
        poly=new int[deg];
        maxDeg=deg-1;
    }

    public void setCoefficient(int degree, int coeff){
        while(degree>poly.length-1){
            doubleCapacity();
        }
        if(maxDeg<degree){
            maxDeg=degree;
        }
        poly[degree]=coeff;
    }

    private void doubleCapacity() {
        int[] temp =poly;
        poly = new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            poly[i]=temp[i];
        }
    }

    public void print(){
        for(int i=0;i<=maxDeg;i++){
            if(poly[i]!=0){
                System.out.print(poly[i]+"x"+i+" ");
            }
        }
    }

    public Polynomial add(Polynomial p2){
        int deg1= this.maxDeg;
        int deg2= p2.maxDeg;
        int n=Math.max(deg1,deg2);
        Polynomial PolySum= new Polynomial(n+1);

        for(int i=0;i<=n;i++){
            int sum=0;
            if(i<=deg1){
                sum+=this.poly[i];
            }
            if(i<=deg2){
                sum+=p2.poly[i];
            }
            PolySum.setCoefficient(i,sum);
        }
        return PolySum;
    }

    public Polynomial subtract(Polynomial p2){
        int deg1= this.maxDeg;
        int deg2= p2.maxDeg;
        int n=Math.max(deg1,deg2);
        Polynomial PolyDiff= new Polynomial(n+1);

        for(int i=0;i<=n;i++){
            int diff=0;
            if(i<=deg1){
                diff+=this.poly[i];
            }
            if(i<=deg2){
                diff=diff-(p2.poly[i]);
            }
            PolyDiff.setCoefficient(i,diff);
        }
        return PolyDiff;
    }

    public Polynomial multiply(Polynomial p2){
        int limit=this.maxDeg+p2.maxDeg;
        Polynomial PolyMul= new Polynomial(limit+1);
        for(int i=0;i<=this.maxDeg;i++){
            int multiply=0;
            for(int j=0;j<=p2.maxDeg;j++){
                multiply=PolyMul.poly[i+j];
                multiply+=(this.poly[i]*p2.poly[j]);
                PolyMul.setCoefficient(i+j, multiply);
            }
        }
        return PolyMul;
    }

//    DynamicArray coefficients;
//
//    public Polynomial(int coeff, int deg){
//        this.coefficients = new DynamicArray();
//        this.coefficients.set(deg,coeff);
//    }
//
//    public void setCoefficient(int deg,int coeff){
//        if(deg>=this.coefficients.size()){
//            int n=coeff-this.coefficients.size()+1;
//            while(n>0){
//                this.coefficients.add(0);
//                n--;
//            }
//        }
//        this.coefficients.set(deg,coeff);
//    }
//
//    public int getCoefficient(int deg){
//        return this.coefficients.get(deg);
//    }
//
//    public int highestDegree(){
//        return this.coefficients.size();
//    }
//
//    public void print(){
//        for(int i=0;i<this.coefficients.size();i++){
//            if(this.coefficients.get(i)!=0){
//                System.out.print(this.coefficients.get(i)+"x^"+i+"+");
//            }
//        }
//    }
//
//    public void add(Polynomial p2){
//        int i=0;
//        while(i<p2.coefficients.size()){
//            int newCoeff=this.coefficients.get(i)+p2.coefficients.get(i);
//            this.setCoefficient(i,newCoeff);
//            i++;
//        }
////        for(int j=i;j<this.coefficients.size();j++){
////            int val=this.coefficients.get(j);
////            this.setCoefficient(j,val);
////        }
////        for(int j=i;j<p2.coefficients.size();j++){
////            int val=p2.coefficients.get(j);
////            this.setCoefficient(j,val);
////        }
//    }
//
//    public void subtract(Polynomial p2){
//        int i=0;
//        while(i<this.coefficients.size() && i<p2.coefficients.size()){
//            int newCoeff=this.coefficients.get(i)-p2.coefficients.get(i);
//            this.coefficients.set(i,newCoeff);
//            i++;
//        }
//        for(int j=i;j<this.coefficients.size();j++){
//            int val=this.coefficients.get(j);
//            this.setCoefficient(j,val);
//        }
//        for(int j=i;j<p2.coefficients.size();j++){
//            int val=p2.coefficients.get(j);
//            this.setCoefficient(j,val);
//        }
//    }
//
//    public void multiply(Polynomial p2){
//        int temp[]=this.coefficients.;
//    }

}
