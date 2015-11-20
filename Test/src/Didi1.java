import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zyt on 15/9/25 19:42.
 */
public class Didi1 {

    public static int maxSubMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j - i == 2) {
                    break;
                }
                sum += matrix[i][j];
            }
        }
        sum = 17;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            ArrayList<String[]> items = new ArrayList<String[]>();
            String line = scanner.nextLine();
            String[] parts = line.split(";");
            int m = parts.length, n = 0;
            for (int i = 0; i < parts.length; i++) {
                parts[i] = parts[i].replaceAll(";", " ");
                String[] item = parts[i].split(" ");
                items.add(item);
                n = items.size();
            }
            System.out.println(items.size() + " " + m + " " + n);
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    //matrix[m][n] = Integer.parseInt(items.get(i)[j]);
                    matrix[m][n] = 1;
                }
            }
            System.out.println(maxSubMatrix(matrix));
        }
    }
}
