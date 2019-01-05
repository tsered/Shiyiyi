package find_avg;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextInt()) {
			int n = cin.nextInt();
			if (n == 0) {
				break;
			}
			int[] num = new int[n];
			int minave = 0;

			int sum = 0;
			for (int i = 0; i < n; i++) {
				num[i] = cin.nextInt();
				sum += num[i];
			}
			// 这里排序了，后面就不用找最小值了，因为从小到大遍历的
			Arrays.sort(num);
			for (int i = 0; i < n; i++) {
				if (num[i] == (sum - num[i]) / (n - 1)) {
					minave = num[i];
					break;
				}
			}
			System.out.printf("%.2f\n", (sum - minave) * 1.0 / (n - 1));
		}
	}

}
