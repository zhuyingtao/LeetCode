import java.util.Scanner;

/**
 * Created by zyt on 15/9/13 09:57.
 */
public class Huawei1 {

    public String findSubString(String a, String b) {
        while (a.contains(b)) {
            a = a.replaceFirst(b, "");
        }
        return a;
    }

    public static void main(String[] args) {
        Huawei1 main = new Huawei1();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            String b = scanner.next();
            System.out.println(main.findSubString(a, b));
        }
    }
}
