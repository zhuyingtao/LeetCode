import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014��4��25�� ����2:11:29
 */
public class Test1490 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			StringBuffer sb = new StringBuffer();
			sb.append(scan.next());
			sb.append(scan.next());
			System.out.println(sb.toString());
		}
		scan.close();
	}
}
