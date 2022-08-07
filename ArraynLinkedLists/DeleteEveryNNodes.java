package ArraynLinkedLists;

public class DeleteEveryNNodes {

    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        if(M==0 && N>0){
            return null;
        }
        if(M==0 && N==0){
            return head;
        }

        int i=1;
        Node<Integer> temp=head;
        Node<Integer> t1=temp;

        while(temp!=null){
            if(i<M){
                t1=t1.next;
                temp=t1;
                i++;
            }else{
                i=1;
                int j=1;
                Node<Integer> t2=t1;
                while(j<=N+1 && t2!=null){
                    t2=t2.next;
                    j++;
                }
                t1.next=t2;
                temp=t2;
                t1=temp;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        Node<Integer> n5=new Node<>(50);
        Node<Integer> n6=new Node<>(60);
        Node<Integer> n7=new Node<>(70);
        Node<Integer> n8=new Node<>(80);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        Node<Integer> temp=skipMdeleteN(n1,2,3);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
