package ArraynLinkedLists;

public class FindNodeRecursive {
    public static int findNodeRec(Node<Integer> head, int n) {
        if (head == null) {
            return -1;
        }
        if(head.data==n){
            return 0;
        }
        int c=findNodeRec(head.next,n);
        if(c>=0){
            return 1+c;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        Node<Integer> n5=new Node<>(50);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        System.out.println(findNodeRec(n1,50));
    }
}
