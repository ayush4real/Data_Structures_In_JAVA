package ArraynLinkedLists;

public class LinkedListUse {

    public static Node<Integer> createLinkedList(){
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        Node<Integer> n5=new Node<>(50);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        return n1;
    }

    public static void printLL(Node n){
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> n1= new Node<>(10);
//        System.out.println(n1.data);
//        System.out.println(n1.next);
        Node<Integer> head=createLinkedList();
        printLL(head);
        System.out.println(head.data);
//        System.out.println(head.data);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);
//        System.out.println(head.next.next.next.data);
//        System.out.println(head.next.next.next.next.data);
    }
}
