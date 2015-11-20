import java.util.Scanner;

/**
 * Created by zyt on 15/11/18 19:19.
 */
public class Chuchujie1 {

    public static String split(String string, int n) {
        StringBuilder sb = new StringBuilder(string);
        for (int i = n; i > 0; i--) {
            int index = sb.indexOf("" + i);
            sb.insert(index + 1, ' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String string = scanner.next();
            System.out.println(split(string, n));
        }
        scanner.close();
    }
}
