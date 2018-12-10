package origami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			int m = cin.nextInt();
			
			// 将数字存放到一个二维数组里面
			int[][] arr = new int[m][m];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = cin.nextInt();
				}
			}
			
			System.out.println(isSymmetryArr(arr) ? "yes" : "no");
		}

	}

	private static boolean isSymmetryArr(int[][] arr) {
		// 判断每一行是否对称
		int m = arr.length;
		for (int row = 0; row < m; row++) {
			for (int i = 0; i < m / 2; i++) {
				if (arr[row][i] != arr[row][m - i - 1]) {
					return false;
				}
			}
		}
		// 判断每一列是否对称
		for (int col = 0; col < m; col++) {
			for (int i = 0; i < m / 2; i++) {
				if (arr[i][col] != arr[m - i - 1][col]) {
					return false;
				}
			}
		}
		return true;
	}

}
