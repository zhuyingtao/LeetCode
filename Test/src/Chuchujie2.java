import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zyt on 15/11/18 19:41.
 */
public class Chuchujie2 {

    static class Node {
        int dst;
        int value;

        public Node(int dst, int value) {
            this.value = value;
            this.dst = dst;
        }
    }

    public static int minSpanningTree(List<Node>[] matrix) {
        int n = matrix.length;
        // initialize
        boolean[] visited = new boolean[n];
        visited[0] = true;
        int count = 1;
        int maxValue = 0;

        while (count < n) {
            int minEdge = 100;
            int minVertex = -1;
            for (int i = 0; i < n; i++) {
                // find minimum edge from all the visited vertex;
                if (visited[i]) {
                    for (int j = 0; j < matrix[i].size(); j++) {
                        Node node = matrix[i].get(j);
                        if (visited[node.dst])
                            continue;
                        if (node.value <= minEdge) {
                            minEdge = node.value;
                            minVertex = node.dst;
                        }
                    }
                }
            }
            if (maxValue < minEdge) maxValue = minEdge;
            visited[minVertex] = true;
            count++;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            ArrayList[] costs = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                costs[i] = new ArrayList<Node>();
            }
            int m = scanner.nextInt();
            for (int i = 0; i < m; i++) {
                int a = scanner.nextInt() - 1;
                int b = scanner.nextInt() - 1;
                int c = scanner.nextInt();
                costs[a].add(new Node(b, c));
            }
            System.out.println(minSpanningTree(costs));
        }
        scanner.close();
    }
}
