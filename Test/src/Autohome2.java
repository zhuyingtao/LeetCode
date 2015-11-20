import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by zyt on 15/11/19 21:19.
 */
public class Autohome2 {

    public static boolean equal(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        HashMap<Character, Integer> times = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            char dh = str2.charAt(i);
            if (times.containsKey(ch)) {
                times.put(ch, times.get(ch) + 1);
            } else {
                times.put(ch, 1);
            }
            if (times.containsKey(dh)) {
                times.put(dh, times.get(dh) - 1);
            } else {
                times.put(dh, -1);
            }
        }
        for (Integer integer : times.values()) {
            if (integer != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            System.out.println(equal(str1, str2));
        }
        scanner.close();
    }
}
