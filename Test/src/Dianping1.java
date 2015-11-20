import java.util.Scanner;

/**
 * Created by zyt on 15/10/9 10:13.
 */
public class Dianping1 {
    
    public static void fib(int n) {
        int[] num = new int[n];
        num[0] = 1;
        num[1] = 1;
        for (int i = 2; i < n; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.println("第" + (i + 1) + "个月的兔子对数：" + num[i]);
        }
    }
    
    public static long fib2(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib2(n - 2) + fib2(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(fib2(scan.nextInt()));
    }
}
