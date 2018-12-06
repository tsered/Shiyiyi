package magic_square;

import java.util.Scanner;

public class Main {

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

			// 三行各自之和
			int sum1 = arr[0][0] + arr[0][1] + arr[0][2];
			int sum2 = arr[1][0] + arr[1][1] + arr[1][2];
			int sum3 = arr[2][0] + arr[2][1] + arr[2][2];

			// 三列各自之和
			int sum4 = arr[0][0] + arr[1][0] + arr[2][0];
			int sum5 = arr[0][1] + arr[1][1] + arr[2][1];
			int sum6 = arr[0][2] + arr[1][2] + arr[2][2];

			// 正对角和斜对角
			int sum7 = arr[0][0] + arr[1][1] + arr[2][2];
			int sum8 = arr[0][2] + arr[1][1] + arr[2][0];
			if (sum1 == sum2 && sum2 == sum3 && sum3 == sum4 && sum4 == sum5 && sum5 == sum6 && sum6 == sum7
					&& sum7 == sum8) {
				System.out.println("Cheers!");

			} else {
				System.out.println("OMyGa!");
			}

		}

	}

}
