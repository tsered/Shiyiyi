package draw_snow;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			drawSnow(cin.nextInt());
		}
	}

	private static void drawSnow(int len) {
		if (len == 1) {
			System.out.println("*\n");
			return;
		}
		int half = len / 2;
		int left = len - half - 1;
		int right = len + half - 1;
		for (int row = 0; row < len; row++) {
			for (int col = 0; col < 2 * len - 1; col++) {
				if (col == left + row || col == right - row || (row == half && col % 2 == 0)) {
					System.out.print("*");
				} else if (row == half || (row < half && col < right - row) || (row > half && col < left + row)) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
