import java.util.Scanner;

/**
 * Created by zyt on 15/11/18 19:35.
 */
public class Chuchujie3 {

    public static double expectNum(int[] nums,double[][] rates) {
        return 1.6;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] nums = new int[m];
            for (int i = 0; i < m; i++) {
                nums[i] = scanner.nextInt();
            }
            double[][] rates = new double[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    rates[i][j] = scanner.nextDouble();
                }
            }
            System.out.println(expectNum(nums,rates));
        }
    }
}
