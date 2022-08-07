package Classes;

public class StudentUse {
    public static void main(String[] args) {
        Student s1= new Student("Ayush");
        Student s2= new Student("Abc");
        Student s3= new Student("Abd");

        System.out.println(Student.getNumStudents());
        System.out.println(Student.getNumStudents());
    }
}
