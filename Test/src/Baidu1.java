import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by zyt on 15/9/17 20:37.
 */
public class Baidu1 {

    public static void fishing(double[][] array, int x, int y, int t) {
        double ratess = 0;
        int n = array.length;
        int m = array[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ratess += array[i][j];
            }
        }
        ratess /= (n * m);
        double ratecc = array[x - 1][y - 1];
        DecimalFormat df = new DecimalFormat("0.0000");
        double leastOne = 0;
        if (ratess >= ratecc) {
            System.out.println(ratess == ratecc ? "equal" : "ss");
            leastOne = 1 - Math.pow((1 - ratess), t);
        } else {
            System.out.println("cc");
            leastOne = 1 - Math.pow((1 - ratecc), t);
        }
        System.out.println(df.format(leastOne));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int t = scanner.nextInt();
            double[][] array = new double[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = scanner.nextDouble();
                }
            }
            fishing(array, x, y, t);
        }
    }
}
