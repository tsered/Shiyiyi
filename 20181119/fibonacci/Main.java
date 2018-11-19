package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] f = new int[100];
		f[1] = 1;

		Scanner cin = new Scanner(System.in);
		String[] arr = cin.nextLine().split(" ");
		for (String str : arr) {
			int n = Integer.valueOf(str);
			if (n <= 1) {
				System.out.println(n);
				continue;
			}
			for (int i = 2; i < n + 1; i++) {
				f[i] = f[i - 1] + f[i - 2];
			}
			System.out.println(f[n]);
		}
	}

}
