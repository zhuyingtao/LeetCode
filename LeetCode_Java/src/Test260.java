import java.util.Arrays;

/**
 * Created by zyt on 15/8/19 15:21.
 */
public class Test260 {
    static class Solution {
        public int[] singleNumber(int[] nums) {
            int result = 0;
            for (int i = 0; i < nums.length; i++)
                result ^= nums[i];
//          int index = Integer.lowestOneBit(result) - 1;
            result &= -result;
            int num1 = 0, num2 = 0;
            for (int num : nums)
                if ((num & result) == 0) {
                    num1 ^= num;
                } else num2 ^= num;
            return new int[]{num1, num2};
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.singleNumber(new int[]{1, 1, 5, -1, -1, 0, 0, 6, 6, 2, 2, 3})));
    }
}
