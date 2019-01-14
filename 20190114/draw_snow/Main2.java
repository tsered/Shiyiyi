package draw_snow;

import java.util.Scanner;

public class Main2 {

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

			// 上面，反过来
			for (int i = half - 1; i >= 0; i--) {
				for (int j = 0; j <= len + i; j++) {
					boolean isSnow = j == len - 2 - i || j == len + i;
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

			// 下面 (len-2-n,len+n)
			for (int i = 0; i < half; i++) {
				for (int j = 0; j <= len + i; j++) {
					boolean isSnow = j == len - 2 - i || j == len + i;
					System.out.print(isSnow ? "*" : " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
