package stack;

public class CustomStackMain  {
    public static void main(String[] args) throws CustomStackException {
        CustomStack stack=new DynamicStack(5);
        stack.push(5);
        stack.push(51);
        stack.push(51);
        stack.push(25);
        stack.push(45);
        stack.push(45);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());
    }

    
}
