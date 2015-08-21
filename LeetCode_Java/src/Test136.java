/**
 * Created by zyt on 15/8/19 14:52.
 */
public class Test136 {

    class Solution {
        public int singleNumber(int[] nums) {
            int temp = 0;
            for (Integer integer : nums) {
                temp ^= integer;
            }
            return temp;
        }
    }
}
