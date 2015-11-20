import java.util.Scanner;

/**
 * Created by zyt on 15/11/15 14:57.
 */
public class Dangdang1 {

    public static String divide(int n, int m) {
        int num = n / m + 1;
        int[] array = new int[num];
        int i = 0;
        while (n-- > 0)
            array[(i++) % num] += 1;
        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < array.length; j++) {
            sb.append(array[j] + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            System.out.println(divide(n, m));
        }
    }
}
