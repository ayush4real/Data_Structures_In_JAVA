package Stack;

public class OnlineStockSpanUse {
    public static void main(String[] args) {
        OnlineStockSpan obj=new OnlineStockSpan();
        System.out.println(obj.next(100));
        System.out.println(obj.next(80));
        System.out.println(obj.next(60));
        System.out.println(obj.next(70));
        System.out.println(obj.next(60));
        System.out.println(obj.next(75));
        System.out.println(obj.next(85));
    }
}
