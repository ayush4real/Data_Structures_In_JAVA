package ArraynLinkedLists;

public class SwappingNodeValuesInLL {

    public static Node<Integer> swapNodes(Node<Integer> head, int k) {
        Node<Integer> temp=head,temp2=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        temp=head;
        int i=1;
        while(i<=len-k){
            temp=temp.next;
            i++;
        }
        i=1;
        while(i<k){
            temp2=temp2.next;
            i++;
        }
        int v= temp2.data;
        temp2.data=temp.data;
        temp.data=v;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(2);
        Node<Integer> n3=new Node<>(3);
        Node<Integer> n4=new Node<>(4);
        Node<Integer> n5=new Node<>(5);
//        Node<Integer> n6=new Node<>(2);
//        Node<Integer> n7=new Node<>(2);
//        Node<Integer> n8=new Node<>(0);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
//        n5.next=n6;
//        n6.next=n7;
//        n7.next=n8;
        Node<Integer> temp=swapNodes(n1,5);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
