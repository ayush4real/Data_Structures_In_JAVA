package ArraynLinkedLists;

public class InsertNodeRecursive {

    public static Node<Integer> insertRecursive(Node<Integer> head, int c, int n,int num){
        if(head==null && c>0){
            return head;
        }
        if(head==null){
            Node<Integer> temp=new Node<>(num);
            return temp;
        }
        if(n==0){
            Node<Integer> temp=new Node<>(num);
            temp.next=head;
            return temp;
        }
        if(c==n){
            Node<Integer> temp=new Node<>(num);
            temp.next=head;
            return temp;
        }
        head.next=insertRecursive(head.next,c+1,n,num);
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(null);
//        Node<Integer> n2=new Node<>(6);
//        Node<Integer> n3=new Node<>(9);
//        Node<Integer> n4=new Node<>(5);
//        Node<Integer> n5=new Node<>(1);
//        n1.next=n2;
//        n2.next=n3;
//        n3.next=n4;
//        n4.next=n5;
        Node<Integer> temp=insertRecursive(n1,0,0,2);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
