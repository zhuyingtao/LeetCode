import java.util.*;

/**
 * Created by zyt on 16/3/22 20:18.
 */
public class Netease2 {

    public static List<String> match(String s) {
        Queue<String> queue = new LinkedList<>();
        List<String> answer = new ArrayList<>();
        queue.add(s);
        while (!queue.isEmpty()) {
            String temp = queue.poll();
            answer.add(temp);
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == '9' || temp.charAt(i) == 'g') {
                    StringBuffer newTemp = new StringBuffer(temp);
                    if (temp.charAt(i) == '9')
                        newTemp.setCharAt(i, 'g');
                    else
                        newTemp.setCharAt(i, '9');
                    if (!queue.contains(newTemp.toString()) && !answer.contains(newTemp.toString()))
                        queue.add(newTemp.toString());
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(match(scanner.next()));
        }
    }
}
