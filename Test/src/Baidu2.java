import java.util.Scanner;

/**
 * Created by zyt on 15/9/17 20:43.
 */
public class Baidu2 {

    public static void reverseArray(int[] array) {
        boolean canReverse = false;
        for (int i = 0; i < array.length; i++) {
            String str = "s";
            byte b1 = 1, b2 = 2, b3, b6, b8;
            final byte b4 = 4, b5 = 5, b7;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("c");
        }
        System.out.println(canReverse ? "yes" : "no");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            reverseArray(array);
        }
        scanner.close();
    }
}
