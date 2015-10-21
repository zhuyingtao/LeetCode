import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by zyt on 15/8/23 10:36.
 */
public class Alibaba {

    class Insurance {
        private static final int total = 2000000;
        private int rest = 2000000;
        private HashMap<String, Integer> users = new HashMap<>();

        public Insurance(String name, int number) {
            this.buy(name, number);
        }

        public boolean checkInput(String name, int number) {
            return number % 1000 != 0 || number > 20000;
        }

        public boolean buy(String name, int number) {
            boolean valid = this.checkInput(name, number);
            if (!valid) {
                return false;
            }
            synchronized (this) {
                if (rest - number < 0) {
                    return false;
                }
                rest = total - number;
                if (users.containsKey(name)) {
                    users.put(name, users.get(name) + number);
                } else {
                    users.put(name, number);
                }
                return true;
            }
        }
        
        public int getTotal() {
            return total;
        }

        public int getRest() {
            return rest;
        }

        public HashMap<String, Integer> getUsers() {
            return users;
        }
    }

    public static void main(String[] args) {
        /*int i = 0;
        Integer j = new Integer(0);
        System.out.println(i == j);
        System.out.println(j.equals(i));*/
        findThree(new int[]{88, 459, 5262, 88, -17, 667, 88, 667, -17, 459, 5262});
        BigDecimal bd = new BigDecimal(2);

    }

    public static int findThree(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result ^= array[i];
        }
        return result;
    }
}


