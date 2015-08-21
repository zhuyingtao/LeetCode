import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zyt on 15/8/19 23:50.
 */
public class Test225 {
    class MyStack {
        Queue<Integer> queue = new LinkedList<>();

        // Push element x onto stack.
        public void push(int x) {
            queue.add(x);
        }

        // Removes the element on top of the stack.
        public void pop() {
            for (int i = 0; i < queue.size() - 1; i++) {
                queue.add(queue.poll());
            }
            queue.poll();
        }

        // Get the top element.
        public int top() {
            for (int i = 0; i < queue.size() - 1; i++) {
                queue.add(queue.poll());
            }
            int x = queue.poll();
            queue.add(x);
            return x;
        }

        // Return whether the stack is empty.
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
