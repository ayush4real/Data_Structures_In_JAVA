package Stack;

public class StackUsingQueuesUse {
    public static void main(String[] args) throws StackEmptyException {
        StackUsingQueues<Integer> stack=new StackUsingQueues<>();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.size());
//        System.out.println(stack.top());
//        System.out.println(stack.isEmpty());
//        stack.push(50);
//        System.out.println(stack.top());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }
}
