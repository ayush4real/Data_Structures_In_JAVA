package ArraynLinkedLists;

public class MaxTwinSumInLL {

    public static int pairSum(Node<Integer> head) {
        Node<Integer> f=head;
        Node<Integer> s=head;
//        int len=0;

        while(f.next!=null && f.next.next!=null){
            f=f.next.next;
            s=s.next;
//            len+=2;
        }
//        len+=2;
//        System.out.println(len);
        Node<Integer> head2=s.next;
        s.next=null;
        Node<Integer> temp=reverseLL(head2);
        int sum=Integer.MIN_VALUE;
        while(temp!=null && head!=null){
            int v=temp.data+ head.data;
            if(v>sum) sum=v;
            temp=temp.next;
            head=head.next;
        }
        return sum;
    }

    public static Node<Integer> reverseLL(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> temp=reverseLL(head.next);
        Node<Integer> reversedTail=head.next;
        reversedTail.next=head;
        head.next=null;
        return temp;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(100000);
//        Node<Integer> n3=new Node<>(2);
//        Node<Integer> n4=new Node<>(1);
//        Node<Integer> n5=new Node<>(0);
//        Node<Integer> n6=new Node<>(2);
//        Node<Integer> n7=new Node<>(2);
//        Node<Integer> n8=new Node<>(0);
        n1.next=n2;
//        n2.next=n3;
//        n3.next=n4;
//        n4.next=n5;
//        n5.next=n6;
//        n6.next=n7;
//        n7.next=n8;
        System.out.println(pairSum(n1));
    }
}
