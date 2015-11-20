import java.util.Scanner;

/**
 * Created by zyt on 15/10/25 16:46.
 */
public class ThreeSixZero2 {

    // I really don't know why the data not passed ??????????????
    public static String lineEditor(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int j = 0; j < sb.length(); j++) {
            char ch = sb.charAt(j);
            if (ch == '#') {
                sb.delete(j - 1, j + 1);
                j = 0;
            } else if (ch == '@') {
                sb.delete(0, j + 1);
                j = 0;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(lineEditor(scan.next()));
        }
    }
}
