package Classes;

public class Student {
    public String name;
    private int rollNumber;
    public final static double CONVERSIONFACTOR=0.95;
    private static int numStudents;

    public Student(String n){
        this.name=n;
        numStudents++;
        this.rollNumber=numStudents;
    }

    public int getRollNumber(){
        return this.rollNumber;
    }

    public void setRollNumber(int num){
        this.rollNumber=num;
    }

    public static int getNumStudents(){
        return numStudents;
    }
}
