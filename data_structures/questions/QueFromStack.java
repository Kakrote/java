package questions;

import java.util.Stack;

public class QueFromStack {
    Stack<Integer> stack_1 = new Stack<>();
    Stack<Integer> stack_2 = new Stack<>();

    public void push(int x) {
        stack_1.push(x);
    }

    public int pop() {
        if (stack_2.isEmpty()) {

            while (!stack_1.isEmpty()) {
                stack_2.push(stack_1.pop());
            }
        }
        return stack_2.pop();
    }

    public int peek() {
       if (stack_2.isEmpty()) {
        System.out.println("copying...");
            while (!stack_1.isEmpty()) {
                stack_2.push(stack_1.pop());
            }
        }
        
        return stack_2.peek();
    }

    public boolean empty() {
        return stack_1.isEmpty() && stack_2.isEmpty();
    }
}
