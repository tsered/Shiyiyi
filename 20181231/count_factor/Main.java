package count_factor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] nums = { 2, 3, 5, 7, 11, 13, 17, 19 };

		// 统计每个数字整数的数量
		int[] countDivisible = new int[9];

		// 统计输入了多少个数字
		int countInput = 0;

		while (cin.hasNextInt()) {
			int N = cin.nextInt();
			if (N == 0) {
				break;
			}
			countInput++;
			countDivisible[getCount(N, nums)]++;
		}
		System.out.println(countInput);
		for (int i = countDivisible.length - 1; i >= 0; i--) {
			System.out.println(i + ":" + countDivisible[i]);
		}
	}

	// 统计n对nums整数了多少个
	private static int getCount(int n, int[] nums) {
		int c = 0;
		for (int num : nums) {
			if (n % num == 0) {
				c++;
			}
		}
		return c;
	}

}
