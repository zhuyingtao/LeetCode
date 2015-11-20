/**
 * Created by zyt on 15/8/23 10:18.
 */
public class Alibaba1 {

    public static int findThree(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result ^= array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        findThree(new int[]{88, 459, 5262, 88, -17, 667, 88, 667, -17, 459, 5262});
    }
}
