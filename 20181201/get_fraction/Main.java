package get_fraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int firstint = cin.nextInt();
		int N = Integer.valueOf(firstint);
		while (N-- > 0) {
			String line = cin.next();
			// 每个小数用X/Y 表示，X=小数点后的数字，Y=小数点后的位数，10的位n次幂,就是Math.pow(10,n)
			int X = Integer.valueOf(line.substring(2));
			int Y = (int) Math.pow(10, line.length() - 2);

			// 从i=X开始倒序的for循环，找到X % i =0 和 Y % i = 0 的数，然后同时 X跟Y除以这个数就是 X/Y了
			int gcd = getGcd(X, Y);
			X = X / gcd;
			Y = Y / gcd;
			System.out.println(X + "/" + Y);
		}
	}

	/**
	 * 获取x和y的最大公约数
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getGcd(int a, int b) {
		for (int i = a; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return 1;
	}

}
