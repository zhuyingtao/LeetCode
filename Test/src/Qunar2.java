import java.util.*;

/**
 * Created by zyt on 15/9/21 09:59.
 */
public class Qunar2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            HashMap<Integer, Integer> nums = new HashMap<>();
            for (int j = 0; j < 3; j++) {
                int n = scanner.nextInt();
                for (int i = 0; i < n; i++) {
                    int num = scanner.nextInt();
                    if (nums.containsKey(num)) {
                        nums.put(num, nums.get(num) + 1);
                    } else {
                        nums.put(num, 1);
                    }
                }
            }
            ArrayList<Integer> array = new ArrayList<>();
            for (Map.Entry<Integer, Integer> o : nums.entrySet()) {
                if (o.getValue() == 3) {
                    array.add(o.getKey());
                }
            }
            Collections.sort(array);
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < array.size(); i++) {
                stringBuffer.append(array.get(i) + " ");
            }
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            System.out.println(stringBuffer.toString());
        }
    }
}
