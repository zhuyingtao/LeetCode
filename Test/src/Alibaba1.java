/**
 * Created by zyt on 15/8/23 10:18.
 */
public class Alibaba1 {
    private int num = 10;
    static int count = 12;
    public int num2 = 13;

    static class StaticNest {
        static int b = 10;
        int a = 0;

        public void add() {
            this.a = 10;
            count++;
            //num2 = 12;
        }
    }

    class NormalNest {
        //static int a = 10;
        int b = 10;

        public void add() {
            num = 10;
            count = 12;
        }
    }


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
