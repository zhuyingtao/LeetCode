import java.util.Stack;

/**
 * Created by zyt on 15/8/19 23:34.
 */
public class Test232 {
    class MyQueue {

        Stack<Integer> inStack = new Stack<>();
        Stack<Integer> outStack = new Stack<>();

        // Push element x to the back of queue.
        public void push(int x) {
            inStack.push(x);
        }

        // Removes the element from in front of queue.
        public void pop() {
            this.peek();
            outStack.pop();
        }

        // Get the front element.
        public int peek() {
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }
            return outStack.peek();
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return inStack.isEmpty() && outStack.isEmpty();
        }
    }
}
