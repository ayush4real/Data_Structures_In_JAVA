package ArraynLinkedLists;

public class MergeInBetweenLinkedList {

    public static Node<Integer> mergeInBetween(Node<Integer> list1, int a, int b, Node<Integer> list2){
        Node<Integer> temp=list1;
        int i=1;
        while(i<a){
            temp=temp.next;
            i++;
        }
        Node<Integer> temp2=temp;
        while(i<=b){
            temp2=temp2.next;
            i++;
        }
        temp.next=list2;
        Node<Integer> temp3=list2;
        while(temp3.next!=null){
            temp3=temp3.next;
        }
        temp3.next=temp2.next;
        return list1;
    }

    public static Node<Integer> mergeInBetweenValues(Node<Integer> list1, int a, int b, Node<Integer> list2) {
        Node<Integer> end=list2;
        while(end.next!=null){
            end=end.next;
        }
        Node<Integer> temp=list1.next;
        Node<Integer> prev=list1;
        Node<Integer> nextN=null;
        boolean setPrev=false;
        while(temp!=null){
            if(temp.next.data==a && !setPrev){
                prev=temp;
                setPrev=true;
            }
            if(temp.data==b){
                nextN=temp.next;
                break;
            }
            temp=temp.next;
        }
        if(list1.data==a){
            end.next=nextN;
            return list2;
        }
        prev.next=list2;
        end.next=nextN;
        return list1;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(0);
        Node<Integer> n2=new Node<>(3);
        Node<Integer> n3=new Node<>(2);
        Node<Integer> n4=new Node<>(1);
        Node<Integer> n5=new Node<>(4);
        Node<Integer> n6=new Node<>(5);
//        Node<Integer> n7=new Node<>(6);
        Node<Integer> n8=new Node<>(10000);
        Node<Integer> n9=new Node<>(10001);
        Node<Integer> n10=new Node<>(10002);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
//        n6.next=n7;

        n8.next=n9;
        n9.next=n10;
        Node<Integer> temp=mergeInBetween(n1, 3,4,n8);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
