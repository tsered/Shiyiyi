package count_symmetry;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			int N = cin.nextInt();
			if (N == 0) {
				break;
			}

			int count = 0;
			for (int i = 1; i <= N; i++) {
				if (isSymmetry(i + "")) {
					count++;
				}
			}
			System.out.println(count);
		}
		cin.close();
	}

	// 判断是否对称
	public static boolean isSymmetry(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			int j = str.length() - 1 - i;
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
