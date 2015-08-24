/**
 * Created by zyt on 15/8/20 11:26.
 */
public class Test070 {

    private class Solution {
        public int climbStairs(int n) {
            if (n == 1) return 1;
            if (n == 2) return 2;
            int step1 = 1, step2 = 2, step = 0;
            for (int i = 3; i <= n; i++) {
                step = step1 + step2;
                step1 = step2;
                step2 = step;
            }
            return step;
        }
    }
}
