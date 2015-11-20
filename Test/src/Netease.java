/**
 * Created by zyt on 15/9/16 19:40.
 */
public class Netease {

    public String appointment(int a, int b, int s) {
        int invalid = s - (Math.abs(a) + Math.abs(b));
        return (invalid < 0 || invalid % 2 != 0) ? "No" : "Yes";
    }
}
