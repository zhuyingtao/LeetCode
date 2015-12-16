import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by zyt on 15/9/13 10:14.
 */
public class Huawei3 {

    public String mod(String a, String b) {
        BigInteger big1 = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);

        try {
            return big1.mod(big2).toString();

        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Huawei3 huawei3 = new Huawei3();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            String b = scanner.next();
            System.out.println(huawei3.mod(a, b));
        }
    }
}
