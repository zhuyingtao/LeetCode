import java.util.Scanner;

public class Test1390 {

	/*
	 * �ѳ���n*2�ĸ�������ֽ⣬��һ���������Ÿ���һ��2*1�ķ��飬��ôʣ�µ�Ϊ2*��n-1)�飬
	 * ���������Ÿ��ǣ�Ӧ�����飬����һ��2*2�Ŀ飬ʣ��2*��n-2���������ָ��ǵķ�ʽ������һ��
	 * ���ǣ���������ͬ�ڵݹ�f(n)=f(n-1)+f(n-2)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			long[] f = new long[100];
			f[0] = 1;
			f[1] = 1;
			for (int i = 2; i <= 70; i++) {
				f[i] = f[i - 1] + f[i - 2];
			}

			System.out.println(f[n]);
		}
		scan.close();
	}
}
