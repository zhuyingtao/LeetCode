/**
 * Created by zyt on 15/8/19 14:43.
 */

public class Test258 {
    class Solution {
        public int addDigits(int num) {
            if (num == 0)
                return 0;
            return num % 9 == 0 ? 9 : num % 9;
        }
    }

    public static void main(String[] args) {
    }
}
