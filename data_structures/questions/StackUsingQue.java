package questions;

import java.util.Queue;
import java.util.LinkedList;

/**
 * StackUsingQue
 */
public class StackUsingQue {

    Queue<Integer> que1 = new LinkedList<>();
    Queue<Integer> que2 = new LinkedList<>();

    public void push(int x) {
        que1.add(x);
    }

    public int pop() {

        // copying the elements of the que1 to que2 and emptying the que1 as well

        for (int i = 0; i < que1.size() - 1; i++) { // make sure that we don't copy the last element into the que2
            que2.add(que1.poll());
        }
        // this will remove the that last remaing element from the que1.
        int removed = que1.poll();
        que1 = que2;
        Queue<Integer> temp = new LinkedList<>();
        que2 = temp;
        return removed;

    }

    public int top() {
        for (int i = 0; i < que1.size() - 1; i++) {
            que2.add(que1.poll());
        }
        int t = que1.peek();
        que2.add(que1.poll());
        que1 = que2;
        Queue<Integer> temp = new LinkedList<>();
        que2 = temp;
        return t;
    }

    public boolean empty() {
        return que1.isEmpty();
    }

}