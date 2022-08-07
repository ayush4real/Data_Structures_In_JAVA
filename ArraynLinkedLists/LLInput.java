package ArraynLinkedLists;

import java.util.Scanner;

public class LLInput {

    public static Node<Integer> takeInput(){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        Node<Integer> head=null;
        while(n!=-1){
            Node<Integer> temp=new Node<>(n);
            if(head==null){
                head=temp;
            }else{
                Node<Integer> tail=head;
                while(tail.next!=null){
                    tail=tail.next;
                }
                tail.next=temp;
            }
            n=s.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head=takeInput();
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
