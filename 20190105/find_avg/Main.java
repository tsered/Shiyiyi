package find_avg;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextInt()) {
			int n = cin.nextInt();
			if (n == 0) {
				break;
			}
			int[] num = new int[n];
			int[] ave = new int[n];

			int sum = 0;
			for (int i = 0; i < n; i++) {
				num[i] = cin.nextInt();
				sum += num[i];
			}
			for (int i = 0; i < n; i++) {
				if (num[i] == ((sum - num[i]) / (n - 1))) {
					ave[i] = num[i];
				}
			}
			int minave = Integer.MAX_VALUE;
			if (ave.length > 1) {
				for (int i = 0; i < ave.length - 1; i++) {
					if (ave[i] > 0 && ave[i] < minave) {
						minave = ave[i];
					}
				}
			}
			System.out.printf("%.2f\n", (sum - minave) * 1.0 / (n - 1));
		}
	}

}
