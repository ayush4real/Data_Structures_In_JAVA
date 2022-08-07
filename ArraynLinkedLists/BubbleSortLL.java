package ArraynLinkedLists;

public class BubbleSortLL {

    public static Node<Integer> bubbleSortLinkedList(Node<Integer> head){
        Node<Integer> t=head;
        int l=0;
        while(t!=null){
            l++;
            t=t.next;
        }
        for(int i=0;i<l-1;i++){
            Node<Integer> prev=null,temp=head;
            for(int j=0;j<l-1-i;j++){
                if(temp.data>temp.next.data){
                    Node<Integer> n=temp.next;
                    if(temp==head){
                        temp.next=n.next;
                        n.next=temp;
                        prev=n;
                        head=n;
                    }else{
                        prev.next=n;
                        temp.next=n.next;
                        n.next=temp;
                        prev=prev.next;
                    }
                }else{
                    prev=temp;
                    temp=temp.next;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(2);
        Node<Integer> n3=new Node<>(3);
        Node<Integer> n4=new Node<>(5);
        Node<Integer> n5=new Node<>(4);
        Node<Integer> n6=new Node<>(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        Node<Integer> t=bubbleSortLinkedList(n1);
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
