package sums_sequence;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine();
		String[] arr = line.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			int n = Integer.valueOf(str);
			int sum = 0;
			for (int j = 1; j <= n; j++) {
				int plus = 0;
				for (int k = 1; k <= j; k++) {
					plus += k;
				}
				sum += plus;
			}
			System.out.println(sum);
		}
	}

}
