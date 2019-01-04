package triangle_flag;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			int n = cin.nextInt();
			int[] num = new int[n];
			char[] c = new char[n];
			for (int i = 0; i < n; i++) {
				num[i] = cin.nextInt();
				c[i] = cin.next().charAt(0);
			}
			// 1 求左边的最大值
			int leftMaxLen = 0;
			if (n > 1) {
				for (int i = 1; i < n; i += 2) {
					if (num[i] > leftMaxLen) {
						leftMaxLen = num[i];
					}
				}
			}
			// 2 依次画三角形
			for (int i = 0; i < n; i++) {
				for (int a = 0; a < num[i]; a++) {
					// 偶数时，需要先输出左边的空格
					if (i % 2 == 0) {
						for (int j = 0; j < leftMaxLen - 1; j++) {
							System.out.print(" ");
						}
					} else {
						for (int j = 0; j < leftMaxLen - a - 1; j++) {
							System.out.print(" ");
						}
					}
					// 输出 a + 1 个字符
					for (int k = 0; k < a + 1; k++) {
						System.out.print(c[i]);
					}
					System.out.println();
				}
			}

		}
	}

}
