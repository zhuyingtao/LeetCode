import java.util.Scanner;

/**
 * Created by zyt on 15/9/19 19:47.
 */
public class Mogujie {

    public static int minMax(int[] array) {

        int maxMar = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] - array[j - 1] > maxMar) {
                maxMar = array[j] - array[j - 1];
            }
        }
        int neighMar[] = new int[array.length - 2];
        for (int i = 0; i < neighMar.length; i++) {
            neighMar[i] = array[i + 2] - array[i];
            if (neighMar[i] < maxMar) {
                neighMar[i] = maxMar;
            }
        }
        int minMaxMar=100000;
        for (int i = 0; i < neighMar.length; i++) {
            if (minMaxMar > neighMar[i]) {
                minMaxMar = neighMar[i];
            }
        }

        return minMaxMar;
    }

    public static int timeMatch(int[][] mo, int[][] gu, int l, int r) {
        int matcher = 0;
        while (l <= r) {
            for (int i = 0; i < gu.length; i++) {
                int s = gu[i][0] + l;
                int e = gu[i][1] + l;
                boolean canMatch = false;
                for (int j = 0; j < mo.length; j++) {
                    if (!(e < mo[j][0] || s > mo[j][1])) {
                        matcher++;
                        canMatch = true;
                        break;
                    }
                }
                if (canMatch) {
                    break;
                }
            }
            l++;
        }
        return matcher;
    }

    public static int moveCircle(int r, int x, int y, int x1, int y1) {
        int step = 0;
        if (x < x1) {
            while (x < x1) {
                x += 2 * r;
                step++;
            }
        } else {
            while (x > x1) {
                x -= 2 * r;
                step++;
            }
        }
        if (y < y1) {
            while (y < y1) {
                y += 2 * r;
                step++;
            }
        } else {
            while (y > y1) {
                y -= 2 * r;
                step++;
            }
        }
        return step;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int r = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            System.out.println(moveCircle(r, x, y, x1, y1));
        }
        scan.close();
    }
}
