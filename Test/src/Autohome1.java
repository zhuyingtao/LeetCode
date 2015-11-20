import java.util.Scanner;

/**
 * Created by zyt on 15/11/19 21:08.
 */
public class Autohome1 {

    public static void split(int[] array) {
        if (array == null || array.length == 0) return;
        int low = array[0], up = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] == array[i] + 1) {
                up = array[i + 1];
            } else {
                System.out.println(low + "-" + up);
                low = up = array[i + 1];
            }
        }
        System.out.println(low + "-" + up);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            split(array);
        }
        scanner.close();
    }
}
