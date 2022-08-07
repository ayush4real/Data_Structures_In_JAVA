package ArraynLinkedLists;

public class AppendLastNToStart {

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        if(n<=0){
            return head;
        }
        int i=0;
        Node<Integer> temp=head;

        while(temp!=null){
            temp=temp.next;
            i++;
        }
        if(i==0) return head;
        int len=i+1;
        i=0;
        int p=len-n;
        temp=head;
        Node<Integer> prev=null;
        while(i<p-1){
            prev=temp;
            temp=temp.next;
            i++;
        }
        Node<Integer> head2=temp;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        prev.next=null;

        temp=head2;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

        return head2;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(2);
        Node<Integer> n3=new Node<>(3);
        Node<Integer> n4=new Node<>(4);
        Node<Integer> n5=new Node<>(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        System.out.println(appendLastNToFirst(n1,5));
    }
}
