import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zyt on 15/9/21 10:23.
 */
public class Qunar3 {

    static class Thread {
        public int id;
        public ArrayList<Integer> holdKeys;
        public ArrayList<Integer> waitKeys;
        public Thread next;
        
        public Thread(int id) {
            this.id = id;
            this.holdKeys = new ArrayList<Integer>();
            this.waitKeys = new ArrayList<Integer>();
        }
        
        public void addHoldKeys(String keys) {
            if (keys.equals(" ")) return;
            String[] parts = keys.split(",");
            for (int i = 0; i < parts.length; i++) {
                holdKeys.add(Integer.parseInt(parts[i]));
            }
        }
        
        public void addWaitKeys(String keys) {
            if (keys.equals(" ")) return;
            String[] parts = keys.split(",");
            for (int i = 0; i < parts.length; i++) {
                waitKeys.add(Integer.parseInt(parts[i]));
            }
        }
    }
    
    public static void detectDeadlock(Thread[] threads) {
        for (int i = 0; i < threads.length; i++) {
            Thread thread = threads[i];
            for (int j = 0; j < thread.waitKeys.size(); j++) {
                int wait = thread.waitKeys.get(j);
                for (int k = 0; k < threads.length; k++) {
                    
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = Integer.parseInt(scanner.nextLine());
            Thread[] threads = new Thread[n];
            for (int i = 0; i < n; i++) {
                String s = scanner.nextLine();
                String[] parts = s.split("\t");
                int id = Integer.parseInt(parts[0]);
                String hold = parts[1];
                String wait = parts[2];
                threads[i] = new Thread(id);
                threads[i].addHoldKeys(hold);
                threads[i].addWaitKeys(wait);
            }
        }
    }
}
