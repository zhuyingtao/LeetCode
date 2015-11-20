import java.util.Scanner;

/**
 * Created by zyt on 15/9/13 10:04.
 */
public class Huawei2 {

    public String countNum(String string) {
        int[] times = new int[10];
        for (int i = 0; i < string.length(); i++) {
            times[string.charAt(i) - '0']++;
        }
        int max = 0, maxCount = 0;
        for (int i = 0; i < times.length; i++) {
            if (maxCount < times[i]) {
                max = i;
                maxCount = times[i];
            }
        }
        return max + "," + maxCount;
    }

    public static void main(String[] args) {
        Huawei2 main = new Huawei2();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            System.out.println(main.countNum(string));
        }
    }

}
