package Generics;

public class Print {
    public static <T extends PrintInterface> void printArray(T[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i].print();
//            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
//        String[] arr={"a","b","c","d"};
//        printArray(arr);

        Vehicle[] v=new Vehicle[5];
        for(int i=0;i<v.length;i++){
            v[i]=new Vehicle(10*i,"ab");
        }
        printArray(v);

        Student[] s=new Student[5];
        for(int i=0;i<v.length;i++){
            s[i]=new Student(10*i);
        }
        printArray(s);
    }
}
