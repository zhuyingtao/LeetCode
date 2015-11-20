/**
 * Created by zyt on 15/10/11 12:03.
 */
public class Meituan1 {

    public static int transform(String hexString) {
        return Integer.parseInt(hexString, 16);
    }

    public static int transform2(String hexString) {
        int sum = 0;
        for (int i = hexString.length() - 1; i >= 0; i--) {
            char ch = hexString.charAt(i);
            int num = 0;
            if (ch >= '0' && ch <= '9') {
                num = ch - '0';
            } else if (ch >= 'a' && ch <= 'e') {
                num = ch - 'a' + 10;
            } else {
                num = ch - 'A' + 10;
            }
            sum += num * Math.pow(10, hexString.length() - 1 - i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(transform("FF"));
        System.out.println(transform("ff"));
        System.out.println(transform("ac07b9f"));
    }
}
