package Stack;

public class StackLLUse {
    public static void main(String[] args) throws Exception {
        StackUsingLinkedList<Integer> stack=new StackUsingLinkedList<>();
        stack.push(10);
        stack.push(10);
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
    }
}
