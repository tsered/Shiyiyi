package draw_snow;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			// 直径5
			int len = cin.nextInt();
			if (len == 1) {
				System.out.println("*\n");
				continue;
			}
			// 半径2
			int half = len / 2;

			// 上面 0->2,6
			// 1->3,5
			// n->len - half + n - 1, len + half - n - 1 (n < half)
			for (int i = 0; i < half; i++) {
				for (int j = 0; j <= len + half - i - 1; j++) {
					boolean isSnow = j == len - half + i - 1 || j == len + half - i - 1;
					System.out.print(isSnow ? "*" : " ");
				}
				System.out.println();
			}
			// 中间9
			for (int j = 0; j < len * 2 - 1; j++) {
				boolean isSnow = j % 2 == 0;
				System.out.print(isSnow ? "*" : " ");
			}
			System.out.println();

			// 下面，跟上面的反过来
			for (int i = half - 1; i >= 0; i--) {
				for (int j = 0; j <= len + half - i - 1; j++) {
					boolean isSnow = j == len - half + i - 1 || j == len + half - i - 1;
					System.out.print(isSnow ? "*" : " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
