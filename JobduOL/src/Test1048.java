import java.util.Scanner;

public class Test1048 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int temp = 0;
			if (b > a) {
				temp = a;
				a = b;
				b = temp;
			}
			if (c > a) {
				temp = a;
				a = c;
				c = temp;
			}
			if (b * b + c * c > a * a) {
				System.out.println("���������");
			} else if (b * b + c * c == a * a) {
				System.out.println("ֱ��������");
			} else {
				System.out.println("�۽�������");
			}
		}
		scan.close();
	}
}
