package ArraynLinkedLists;

class DoubleLL<String>{
    DoubleLL<String> prev;
    DoubleLL<String> next;
    String data;

    public DoubleLL(String data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class BrowserHistoryUsingDoubleLL {
    DoubleLL<String> head;

    public BrowserHistoryUsingDoubleLL(String homePg){
        head=new DoubleLL<>(homePg);
    }

    public void visit(String url){
        DoubleLL<String> newN=new DoubleLL<>(url);
        head.next=newN;
        newN.prev=head;
        head=head.next;
    }

    public String back(int steps){
        while(head.prev!=null && steps>0){
            head=head.prev;
            steps--;
        }
        return head.data;
    }

    public String forward(int steps){
        while(head.next!=null && steps>0){
            head=head.next;
            steps--;
        }
        return head.data;
    }

    public static void main(String[] args) {
        BrowserHistoryUsingDoubleLL obj=new BrowserHistoryUsingDoubleLL("zav");
        obj.visit("kni");
//        obj.visit("fb");
//        obj.visit("yt");
        System.out.println(obj.back(7));
        System.out.println(obj.back(7));
        System.out.println(obj.forward(5));
        System.out.println(obj.forward(1));
        obj.visit("pw");
        obj.visit("mo");
//        System.out.println(obj.forward(2));
//        System.out.println(obj.back(2));
        System.out.println(obj.back(9));
    }
}
