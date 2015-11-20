import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zyt on 15/9/25 20:06.
 */
public class Didi2 {

    public static String maxZeroSub(ArrayList<Integer> array) {
        int start = 0, end = 0, max = 0;
        for (int i = 0; i < array.size(); i++) {
            int s = i, e = 0, sum = 0;
            for (int j = i; j < array.size(); j++) {
                sum += array.get(j);
                if (sum == 0) {
                    e = j;
                    if (e - s > max) {
                        start = s;
                        end = e;
                        max = e - s;
                    }
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = start; i <= end; i++) {
            sb.append(array.get(i) + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] parts = s.split(" ");
            for (int i = 0; i < parts.length; i++) {
                array.add(Integer.parseInt(parts[i]));
            }
            System.out.println(maxZeroSub(array));
        }
    }
}
