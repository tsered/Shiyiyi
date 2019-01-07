package draw_cube;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int M = cin.nextInt();
		int max = Math.max(N, M);

		// 总共max+2行
		for (int row = 0; row < max + 2; row++) {
			// 处理左边
			if (row == 0) {
				printFirstAndLastRow(N, false);
			} else if (row <= N) {
				printMiddleRow(N, false);
			} else if (row == N + 1) {
				printFirstAndLastRow(N, false);
			}

			// 处理右边
			if (row == 0) {
				printFirstAndLastRow(M, true);
			} else if (row <= M) {
				if (N < M && row > N + 1) {
					printLeftBlankRow(N, false);
				}
				printMiddleRow(M, true);
			} else if (row == M + 1) {
				if (N < M) {
					printLeftBlankRow(N, false);
				}
				printFirstAndLastRow(M, true);
			}
			System.out.println();
		}
	}

	private static void printLeftBlankRow(int N, boolean isRight) {
		if (isRight) {
			System.out.print("   ");
		}
		System.out.print(" ");
		for (int i = 0; i < 2 * N + 1; i++) {
			System.out.print(" ");
		}
		System.out.print(" ");
	}

	private static void printMiddleRow(int N, boolean isRight) {
		if (isRight) {
			System.out.print("   ");
		}
		System.out.print("I");
		for (int i = 0; i < 2 * N + 1; i++) {
			if (i % 2 == 0) {
				System.out.print("-");
			} else {
				System.out.print("X");
			}
		}
		System.out.print("I");
	}

	private static void printFirstAndLastRow(int N, boolean isRight) {
		if (isRight) {
			System.out.print("   ");
		}
		System.out.print("+");
		for (int i = 0; i < 2 * N + 1; i++) {
			System.out.print("-");
		}
		System.out.print("+");
	}
}
