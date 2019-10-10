import java.util.Scanner;

/**
 * Created by zyt on 16/3/28 20:19.
 */
public class ThreeSixZero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int b = scanner.nextInt();
            int a;
            if (b <= n / 2) {
                a = b + 1;
            } else {
                a = b - 1;
            }
            System.out.println(a);
        }
    }
}
