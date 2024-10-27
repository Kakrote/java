package questions;

import java.util.Stack;

public class ValidateStack {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // creating a stack to check the seques of the pushed and popped elements
        Stack<Integer> stack=new Stack<>();
        int j=0; // pointer for the popped array

        // adding the elements to the stack in the sequesnce of pushed array
        for(int x:pushed){
            stack.push(x);

            // checking the sequesnce of the popped and validating 
            while (!stack.isEmpty() && stack.peek()==popped[j]) {

                stack.pop();
                j++;
                
            }
        }
        return stack.isEmpty(); // this validates if the stack is valid or not
    }
}
