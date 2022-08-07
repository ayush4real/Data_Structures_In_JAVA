package ArraynLinkedLists;

public class RemoveDuplicatesInASortedList {

    public static Node<Integer> deleteDuplicates(Node<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }else{
            Node<Integer> temp=head.next,prev=head;
            while(temp.next!=null){
                if(temp.data!= prev.data){
                    prev.next=temp;
                    prev=temp;
//                    temp=temp.next;
                }
                temp=temp.next;
            }
            if(temp.data==prev.data){
                prev.next= null;
            }else{
                prev.next=temp;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(2);
        Node<Integer> n3=new Node<>(2);
//        Node<Integer> n4=new Node<>(2);
//        Node<Integer> n5=new Node<>(2);
//        Node<Integer> n6=new Node<>(3);
//        Node<Integer> n7=new Node<>(3);
//        Node<Integer> n8=new Node<>(3);
//        Node<Integer> n9=new Node<>(4);

        n1.next=n2;
        n2.next=n3;
//        n3.next=n4;
//        n4.next=n5;
//        n5.next=n6;
//        n6.next=n7;
//        n7.next=n8;
//        n8.next=n9;
        Node<Integer> temp=deleteDuplicates(n1);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}
