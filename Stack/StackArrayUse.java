package Stack;

public class StackArrayUse {
    public static void main(String[] args) throws Exception {
        StackUsingArray stack= new StackUsingArray();

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
