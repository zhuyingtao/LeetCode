import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by zyt on 15/10/25 16:27.
 */
public class ThreeSixZero1 {

    public static int findRelative(int[][] relations, int total, int base) {
        int count = 0;
        byte[] people = new byte[total + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(base);
        people[base] = 1;
        while (!queue.isEmpty()) {
            int s = queue.poll();
            for (int i = 0; i < relations.length; i++) {
                if (relations[i][0] == s && people[relations[i][1]] != 1) {
                    queue.offer(relations[i][1]);
                    people[relations[i][1]] = 1;
                    count++;
                }
                if (relations[i][1] == s && people[relations[i][0]] != 1) {
                    queue.offer(relations[i][0]);
                    people[relations[i][0]] = 1;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int[][] relations = new int[m][2];
            for (int i = 0; i < m; i++) {
                relations[i][0] = scan.nextInt();
                relations[i][1] = scan.nextInt();
            }
            System.out.println(findRelative(relations, n, 1));
        }
    }
}
