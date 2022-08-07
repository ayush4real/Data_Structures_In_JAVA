package ArraynLinkedLists;

class MyHashSet {
    Node<Integer> head=null;

    public MyHashSet() {

    }

    public void add(int key) {
        if(head==null){
            head=new Node<>(key);
        }else{
            Node<Integer> prev=null,temp=head;
            while (temp!=null){
                if(temp.data==key){
                    return;
                }
                prev=temp;
                temp=temp.next;
            }
            prev.next=new Node<>(key);
        }
    }

    public void remove(int key) {
        if (head == null) {
            return;
        }
        if(head.data==key){
            head=head.next;
        }else{
            Node<Integer> prev=head,temp=head.next;
            while(temp!=null){
                if(temp.data==key){
                    prev.next=temp.next;
                    return;
                }
                prev=temp;
                temp=temp.next;
            }
        }
    }

    public boolean contains(int key) {
        if(head==null){
            return false;
        }else{
            Node<Integer> temp=head;
            while(temp!=null){
                if(temp.data==key){
                    return true;
                }
                temp=temp.next;
            }
        }
        return false;
    }
}

public class ImplementHashSetUsingLinkedLists {
    public static void main(String[] args) {
        MyHashSet hs= new MyHashSet();
        hs.add(1);
        System.out.println(hs.contains(2));
        hs.add(2);
        System.out.println(hs.contains(2));
        hs.remove(1);
        hs.remove(2);
        hs.remove(3);
        System.out.println(hs.contains(1));
    }
}
