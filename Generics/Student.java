package Generics;

public class Student implements PrintInterface {
    int rollNum;

    public Student(int rollNum){
        this.rollNum=rollNum;
    }

    public void print(){
        System.out.println(this.rollNum);
    }
}
