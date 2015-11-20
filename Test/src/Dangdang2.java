import java.util.Scanner;

/**
 * Created by zyt on 15/11/15 15:15.
 */
public class Dangdang2 {

    public static int combination(int n) {
        int minStep = (n % 2 == 0) ? n / 2 : n / 2 + 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(combination(n));
        }
    }
}
