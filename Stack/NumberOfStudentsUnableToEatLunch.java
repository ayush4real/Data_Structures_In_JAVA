package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfStudentsUnableToEatLunch {

    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue=new LinkedList<>();
        for (int student : students) {
            queue.add(student);
        }
        for (int sandwich : sandwiches) {
            int j = 1;
            while (j <= queue.size()) {
                if (sandwich == queue.peek()) {
                    queue.remove();
                    break;
                } else {
                    queue.add(queue.remove());
                    j++;
                    if(j>queue.size()){
                        return queue.size();
                    }
                }
            }
        }
        return queue.size();
    }

    public static void main(String[] args) {
        int[] students={1,1,1,0,0,1};
        int[] sandwiches={1,0,0,0,1,1};
        System.out.println(countStudents(students,sandwiches));
    }
}
