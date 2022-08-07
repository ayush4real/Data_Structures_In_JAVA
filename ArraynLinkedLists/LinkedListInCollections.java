package ArraynLinkedLists;

import java.util.LinkedList;

public class LinkedListInCollections {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(1,100);
        list.set(0,20);
//        System.out.println(list.get(0));
        list.remove();
        System.out.println(list.get(0));
    }
}
