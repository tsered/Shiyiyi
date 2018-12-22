package shortest_point;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String[] arr = cin.nextLine().split(" ");
		int X0 = Integer.valueOf(arr[0]);
		int Y0 = Integer.valueOf(arr[1]);

		// min 保存最小距离值的平方，minX，minY 保存最小距离对应的坐标
		int min = Integer.MAX_VALUE;
		int minX = 0;
		int minY = 0;
		while (cin.hasNextLine()) {
			String[] brr = cin.nextLine().split(" ");
			// 计算点到给定点的距离平方
			int X = Integer.valueOf(brr[0]);
			int Y = Integer.valueOf(brr[1]);
			int Z = (X0 - X) * (X0 - X) + (Y0 - Y) * (Y0 - Y);
			if (min > Z) {
				min = Z;
				minX = X;
				minY = Y;
			}
		}
		System.out.println(minX + " " + minY);

	}

}
