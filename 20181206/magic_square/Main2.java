package magic_square;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			// 按顺序读取整数，放入二维数组里面
			int[][] arr = new int[3][3];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					arr[i][j] = cin.nextInt();
				}
			}
			System.out.println(isAllEqual15(arr) ? "Cheers!" : "OMyGa!");
		}
	}

	// 判断是否行、列、斜线相加都等于15
	private static boolean isAllEqual15(int[][] arr) {
		for (int i = 0; i < 3; i++) {
			if (arr[i][0] + arr[i][1] + arr[i][2] != 15) {
				return false;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (arr[0][i] + arr[1][i] + arr[2][i] != 15) {
				return false;
			}
		}
		if (arr[0][0] + arr[1][1] + arr[2][2] != 15) {
			return false;
		}
		if (arr[2][0] + arr[1][1] + arr[0][2] != 15) {
			return false;
		}
		return true;
	}

}
