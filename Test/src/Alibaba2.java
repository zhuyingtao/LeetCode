import java.util.HashMap;

/**
 * Created by zyt on 15/8/23 10:36.
 */
public class Alibaba2 {
    
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
    }
}


