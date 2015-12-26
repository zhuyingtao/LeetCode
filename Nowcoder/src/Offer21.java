import java.util.Stack;

/**
 * Created by zyt on 15/12/25 17:16.
 */
public class Offer21 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < popA.length; i++) {
            int dst = popA[i];
            int j = 0;
            while (stack.peek() != dst) {
                stack.push(pushA[j++]);
            }
        }
        return false;
    }
}
