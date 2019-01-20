package swap_triangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextInt()) {
			int n = cin.nextInt();
			for (int i = 0; i < n; i++) {

				for (int j = 0; j <= i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < 2 * n - 1 - 2 * i; k++) {
					if (k % 2 == 0) {
						System.out.print("S");
					} else {
						System.out.print("T");
					}
				}
				System.out.println();

			}
		}

	}

}
