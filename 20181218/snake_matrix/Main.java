package snake_matrix;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String firstline = cin.nextLine();
		int N = Integer.valueOf(firstline);
		while (N-- > 0) {
			String line = cin.nextLine();
			String[] arr = line.split(" ");
			int M = Integer.valueOf(arr[0]);
			int K = Integer.valueOf(arr[1]);
			int[][] biaoge = new int[M][M];
			int max = M * M;
			for (int i = 0; i < M; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < M; j++) {
						biaoge[i][j] = K++;
						if (K > max) {
							K = 1;
						}
					}
				} else {
					for (int j = M - 1; j >= 0; j--) {
						biaoge[i][j] = K++;
						if (K > max) {
							K = 1;
						}
					}
				}
			}
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < M; j++) {
					System.out.printf("%4d", biaoge[i][j]);
				}
				if (N != 0 || i != M - 1) {
					System.out.println();
				}
			}
			if (N != 0) {
				System.out.println();
			}
		}

	}

}
